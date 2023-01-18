package com.github.hi_hecatia.th_legend_lk;

import com.github.hi_hecatia.th_legend_lk.init.InitBlocks;
import com.github.hi_hecatia.th_legend_lk.init.InitItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TouHou_TheLegendofLunaticKingdom.MOD_ID)
public class TouHou_TheLegendofLunaticKingdom {

	public static final String MOD_ID = "th_legend_lk";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	public TouHou_TheLegendofLunaticKingdom() {
		//物品初始化注册
		InitItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		InitBlocks.BLOCK.register(FMLJavaModLoadingContext.get().getModEventBus());
		//添加Geckollib初始化
		//GeckoLib.initialize();
	}

	public TouHou_TheLegendofLunaticKingdom(int i) {

	}

}
