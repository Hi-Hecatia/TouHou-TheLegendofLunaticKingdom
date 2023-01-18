package com.github.hi_hecatia.th_legend_lk.data;

import com.github.hi_hecatia.th_legend_lk.TouHou_TheLegendofLunaticKingdom;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = TouHou_TheLegendofLunaticKingdom.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDataGenEvent {

    @SubscribeEvent
    public static void DataGenerating(GatherDataEvent event){
        DataGenerator dataGenerator = event.getGenerator();
        dataGenerator.addProvider(new ModLootTables(event.getGenerator()));
        dataGenerator.addProvider(new ModRecipes(event.getGenerator()));
    }
}
