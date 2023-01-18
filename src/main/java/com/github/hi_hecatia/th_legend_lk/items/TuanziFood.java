package com.github.hi_hecatia.th_legend_lk.items;

import com.github.hi_hecatia.th_legend_lk.tab.TouHou_TheLegendofLunaticKingdom_Tab;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;

public class TuanziFood extends Item {

    private static final Food eatFood = (new Food.Builder()).nutrition(4).saturationMod(0.3f).build();

    public TuanziFood() {
        super(new Properties().tab(TouHou_TheLegendofLunaticKingdom_Tab.itemTab).stacksTo(64).rarity(Rarity.COMMON).food(eatFood));
    }

    public void test(){
        ItemStack stack;
        LivingEntity entity;
    }

    public int getItemEnchantability() {
        return 0;
    }
}
