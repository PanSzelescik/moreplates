package panszelescik.moreplates.init;

import panszelescik.morelibs.register.Register;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.items.ItemHammer;

@Register(modid = MorePlates.MODID)
public class Items {

    @Register.RegisterItem(registryName = "hammer")
    public static ItemHammer hammer;
}