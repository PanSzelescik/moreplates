package panszelescik.moreplates.items;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentDurability;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.config.Config;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Random;

public class ItemHammer extends Item {

    private static final Random RAND = new Random();

    public ItemHammer() {
        super(new Item.Properties()
                .group(MorePlates.TAB)
                .maxStackSize(1)
                .setNoRepair());
        setRegistryName(new ResourceLocation(MorePlates.MODID, "hammer"));
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return Config.DURABILITY_HAMMER.get();
    }

    @Override
    public int getDamage(ItemStack stack) {
        return !stack.hasTag() ? getMaxDamage(stack) : stack.getOrCreateTag().getInt("Damage");
    }

    @Nonnull
    @Override
    public ItemStack getContainerItem(@Nonnull ItemStack stack) {
        ItemStack container = stack.copy();
        this.damageTool(container, 1, RAND, null);
        return container;
    }

    private void damageTool(ItemStack stack, int amount, Random rand, @Nullable EntityPlayer player) {
        if (amount <= 0)
            return;
        int unbreakLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.UNBREAKING, stack);
        for (int i = 0; unbreakLevel > 0 && i < amount; i++)
            if (EnchantmentDurability.negateDamage(stack, unbreakLevel, rand))
                amount--;
        if (amount <= 0)
            return;
        int curDamage = stack.getOrCreateTag().getInt("Damage");
        curDamage += amount;
        if (player instanceof EntityPlayerMP)
            CriteriaTriggers.ITEM_DURABILITY_CHANGED.trigger((EntityPlayerMP) player, stack, curDamage);
        if (curDamage >= Config.DURABILITY_HAMMER.get()) {
            if (player != null) {
                player.renderBrokenItemStack(stack);
            }
            stack.shrink(1);
            return;
        }
        stack.getTag().putInt("Damage", curDamage);
    }

    @Override
    public int getItemEnchantability() {
        return 14;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return enchantment == Enchantments.UNBREAKING || enchantment == Enchantments.MENDING;
    }
}