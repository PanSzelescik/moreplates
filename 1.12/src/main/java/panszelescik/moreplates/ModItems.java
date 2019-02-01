package panszelescik.moreplates;

import panszelescik.morelibs.register.Register;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.items.ItemHammer;

@Register(modid = MorePlates.MODID)
public class ModItems {

    @Register.RegisterItem(registryName = "hammer")
    public static ItemHammer hammer;
}