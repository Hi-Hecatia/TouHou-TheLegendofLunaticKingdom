package com.github.hi_hecatia.th_legend_lk.init;

import com.github.hi_hecatia.th_legend_lk.TouHou_TheLegendofLunaticKingdom;
import com.github.hi_hecatia.th_legend_lk.block.MoonRockBlock;
import com.github.hi_hecatia.th_legend_lk.block.MoonSandBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModInitBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TouHou_TheLegendofLunaticKingdom.MOD_ID);
    public static final RegistryObject<Block> MOONROCK = BLOCKS.register("moon_rock", MoonRockBlock::new);
    public static final RegistryObject<Block> MOOONSAND = BLOCKS.register("moon_sand", MoonSandBlock::new);
}
