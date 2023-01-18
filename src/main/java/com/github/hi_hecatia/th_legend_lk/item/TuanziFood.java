package com.github.hi_hecatia.th_legend_lk.item;

import com.github.hi_hecatia.th_legend_lk.tab.TouHou_TheLegendofLunaticKingdom_Tab;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class TuanziFood extends Item {

    private static final FoodProperties EATFOOD = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).build();

    public TuanziFood() {
        super(new Properties().tab(TouHou_TheLegendofLunaticKingdom_Tab.tab).stacksTo(64).food(EATFOOD).rarity(Rarity.COMMON));
    }

    @Override
    public void appendHoverText(ItemStack stack, Level world, List<Component> chat, TooltipFlag flag){
        super.appendHoverText(stack,world,chat,flag);
        chat.add(new TranslatableComponent("chat.th_legend_lk.tuanzi.note"));
    }
}
