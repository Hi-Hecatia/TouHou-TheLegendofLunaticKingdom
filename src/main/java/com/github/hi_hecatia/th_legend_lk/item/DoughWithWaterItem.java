package com.github.hi_hecatia.th_legend_lk.item;

import com.github.hi_hecatia.th_legend_lk.tab.TouHou_TheLegendofLunaticKingdom_Tab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class DoughWithWaterItem extends Item {
    public DoughWithWaterItem() {
        super(new Properties().tab(TouHou_TheLegendofLunaticKingdom_Tab.tab).stacksTo(64).rarity(Rarity.COMMON));
    }
}
