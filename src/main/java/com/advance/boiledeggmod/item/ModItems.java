package com.advance.boiledeggmod.item;

import com.advance.boiledeggmod.util.Registration;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

    public static final RegistryObject<Item> BOILED_EGG =
            Registration.ITEMS.register("boiled_egg",
                    () -> new BoiledEgg());

    public static void register() { }
}
