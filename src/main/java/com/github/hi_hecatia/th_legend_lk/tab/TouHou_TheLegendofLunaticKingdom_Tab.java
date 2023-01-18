package com.github.hi_hecatia.th_legend_lk.tab;

import com.github.hi_hecatia.th_legend_lk.TouHou_TheLegendofLunaticKingdom;
import com.github.hi_hecatia.th_legend_lk.init.ModInitItems;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

public class TouHou_TheLegendofLunaticKingdom_Tab extends CreativeModeTab {

    public static CreativeModeTab tab = new TouHou_TheLegendofLunaticKingdom_Tab("items", ModInitItems.YINYANGORB);
    // 物品栏名字展示
    private final Component nameToDisplay;
    private final RegistryObject<Item> iconItem;
    private ItemStack icon= null;

    public TouHou_TheLegendofLunaticKingdom_Tab(String label, RegistryObject<Item> iconItem) {
        super(String.format("th_legend_lk.%s", label));
        String fullName = String.format("itemgroup.%s.%s", TouHou_TheLegendofLunaticKingdom.MOD_ID, label);
        nameToDisplay = new TranslatableComponent(fullName);
        this.iconItem = iconItem;
    }

    @Override
    public ItemStack makeIcon() {
        if (icon == null) {
            icon = iconItem.get().getDefaultInstance();
        }
        return icon;
    }

    public Component getNameToDisplay() {
        return nameToDisplay;
    }
}
