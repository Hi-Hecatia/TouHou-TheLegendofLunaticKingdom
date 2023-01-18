package com.github.hi_hecatia.th_legend_lk.items;

import com.github.hi_hecatia.th_legend_lk.tab.TouHou_TheLegendofLunaticKingdom_Tab;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class TuanziFromLunaFood extends Item {

    private static final Food eatFood = (new Food.Builder()).saturationMod(0.3f).nutrition(2).effect(() -> new EffectInstance(Effects.HEALTH_BOOST, 180, 1), 1f).build();

    public TuanziFromLunaFood() {
        super(new Properties().tab(TouHou_TheLegendofLunaticKingdom_Tab.itemTab).stacksTo(64).rarity(Rarity.UNCOMMON).food(eatFood));
    }

}
