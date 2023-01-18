package com.github.hi_hecatia.th_legend_lk;

import com.github.hi_hecatia.th_legend_lk.init.ModInitBlocks;
import com.github.hi_hecatia.th_legend_lk.init.ModInitItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TouHou_TheLegendofLunaticKingdom.MOD_ID)
public class TouHou_TheLegendofLunaticKingdom {

    public static final String MOD_ID = "th_legend_lk";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public TouHou_TheLegendofLunaticKingdom(){
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModInitItems.ITEMS.register(eventBus);
        ModInitBlocks.BLOCKS.register(eventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public TouHou_TheLegendofLunaticKingdom(int i){}
}
