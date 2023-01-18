package com.github.hi_hecatia.th_legend_lk.init;

import com.github.hi_hecatia.th_legend_lk.TouHou_TheLegendofLunaticKingdom;
import com.github.hi_hecatia.th_legend_lk.item.*;
import com.github.hi_hecatia.th_legend_lk.tab.TouHou_TheLegendofLunaticKingdom_Tab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModInitItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TouHou_TheLegendofLunaticKingdom.MOD_ID);
    public static final RegistryObject<Item> YINYANGORB = ITEMS.register("yinyang_orb", YinYangOrbItem::new);
    public static final RegistryObject<Item> MOONROCK = ITEMS.register("moon_rock", () -> new BlockItem(ModInitBlocks.MOONROCK.get(), new Item.Properties().tab(TouHou_TheLegendofLunaticKingdom_Tab.tab).stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> MOONSAND = ITEMS.register("moon_sand",() -> new BlockItem(ModInitBlocks.MOOONSAND.get(), new Item.Properties().tab(TouHou_TheLegendofLunaticKingdom_Tab.tab).stacksTo(64).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> TUANZI = ITEMS.register("tuanzi", TuanziFood::new);
    public static final RegistryObject<Item> TUANZI_FROM_LUNA = ITEMS.register("tuanzi_from_luna", TuanziFromLunaFood::new);
    public static final RegistryObject<Item> DOUGH_WITH_WATER = ITEMS.register("dough_with_water", DoughWithWaterItem::new);
    public static final RegistryObject<Item> TUANZI_WITHOUT_STICK = ITEMS.register("tuanzi_without_stick", TuanziWithoutStick::new);
}
