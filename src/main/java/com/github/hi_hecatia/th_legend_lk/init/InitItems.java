package com.github.hi_hecatia.th_legend_lk.init;

import com.github.hi_hecatia.th_legend_lk.TouHou_TheLegendofLunaticKingdom;
import com.github.hi_hecatia.th_legend_lk.items.TuanziFood;
import com.github.hi_hecatia.th_legend_lk.items.TuanziFromLunaFood;
import com.github.hi_hecatia.th_legend_lk.items.YinYangOrbItem;
import com.github.hi_hecatia.th_legend_lk.tab.TouHou_TheLegendofLunaticKingdom_Tab;

import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.item.BlockItem;

public class InitItems {

    //创建物品注册对象
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TouHou_TheLegendofLunaticKingdom.MOD_ID);
    public static final RegistryObject<Item> YINYANGORB = ITEMS.register("yinyang_orb", YinYangOrbItem::new);
    public static final RegistryObject<Item> TUANZI = ITEMS.register("tuanzi",TuanziFood::new);
    public static final RegistryObject<Item> TUANZIFROMLUNA = ITEMS.register("tuanzi_fromluna", TuanziFromLunaFood::new);
    public static final RegistryObject<Item> MOONROCK = ITEMS.register("moon_rock", () -> new BlockItem(InitBlocks.MOONROCK.get(), new Item.Properties().tab(TouHou_TheLegendofLunaticKingdom_Tab.itemTab).stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> MOONSAND = ITEMS.register("moon_sand", () -> new BlockItem(InitBlocks.MOONSAND.get(), new Item.Properties().tab(TouHou_TheLegendofLunaticKingdom_Tab.itemTab).stacksTo(64).rarity(Rarity.COMMON)));
}
