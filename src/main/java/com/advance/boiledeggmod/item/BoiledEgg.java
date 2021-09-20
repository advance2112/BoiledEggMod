package com.advance.boiledeggmod.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BoiledEgg extends Item{

    public BoiledEgg(){
        super(new Properties().tab(ItemGroup.TAB_FOOD)
                .food(new Food.Builder()
                        .nutrition(2)
                        .saturationMod(3.2F)
                        .build()));
    }
}
