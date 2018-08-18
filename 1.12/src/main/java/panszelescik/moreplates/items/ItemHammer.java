package panszelescik.moreplates.items;

import static panszelescik.moreplates.Reference.*;

import java.util.List;
import java.util.Random;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentDurability;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import panszelescik.moreplates.config.Config;
import panszelescik.moreplates.helpers.IItemDamageble;
import panszelescik.moreplates.helpers.NBTHelper;

public class ItemHammer extends ItemBase implements IItemDamageble {
	
	static final Random RAND = new Random();
	
	public ItemHammer() {
		super();
		String name = "hammer";
		setTranslationKey(MODID + "." + name);
		setRegistryName(new ResourceLocation(MODID, name));
		setContainerItem(this);
		setMaxDamage(Config.durabilityHammer);
		maxStackSize = 1;
		canRepair = false;
	}
	
	@Override
	public boolean isDamageable() {
		return true;
	}
	
	@Override
	public int getItemMaxDamage(ItemStack stack) {
		return Config.durabilityHammer;
	}

	@Override
	public int getItemDamage(ItemStack stack) {
		return NBTHelper.getInt(stack, "Damage");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(I18n.format(getTranslationKey() + ".uses_left") + (getItemMaxDamage(stack) - getItemDamage(stack)));
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
		for (int i = 0; unbreakLevel > 0&&i < amount; i++)
			if (EnchantmentDurability.negateDamage(stack, unbreakLevel, rand))
				amount--;
		if (amount <= 0)
			return;
		int curDamage = NBTHelper.getInt(stack, "Damage");
		curDamage += amount;
		if (player instanceof EntityPlayerMP)
			CriteriaTriggers.ITEM_DURABILITY_CHANGED.trigger((EntityPlayerMP)player, stack, curDamage);
		if (curDamage >= Config.durabilityHammer) {
			if (player != null) {
				player.renderBrokenItemStack(stack);
				player.addStat(StatList.getObjectBreakStats(this));
			}
			stack.shrink(1);
			return;
		}
		NBTHelper.setInt(stack, "Damage", curDamage);
	}
	
	@Override
	public boolean showDurabilityBar(ItemStack stack) {
		return NBTHelper.getInt(stack, "Damage") > 0;
	}
	
	@Override
	public double getDurabilityForDisplay(ItemStack stack) {
		double max = (double)getItemMaxDamage(stack);
		return NBTHelper.getInt(stack, "Damage") / max;
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