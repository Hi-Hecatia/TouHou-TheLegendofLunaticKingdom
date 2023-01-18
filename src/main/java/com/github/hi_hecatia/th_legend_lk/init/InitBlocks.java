package com.github.hi_hecatia.th_legend_lk.init;

import com.github.hi_hecatia.th_legend_lk.TouHou_TheLegendofLunaticKingdom;
import com.github.hi_hecatia.th_legend_lk.blocks.MoonRockBlock;
import com.github.hi_hecatia.th_legend_lk.blocks.MoonSandBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitBlocks {

    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, TouHou_TheLegendofLunaticKingdom.MOD_ID);
    public static final RegistryObject<Block> MOONROCK = BLOCK.register("moon_rock", MoonRockBlock::new);
    public static final RegistryObject<Block> MOONSAND = BLOCK.register("moon_sand", MoonSandBlock::new);
}
