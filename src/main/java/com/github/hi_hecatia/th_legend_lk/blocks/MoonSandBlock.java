package com.github.hi_hecatia.th_legend_lk.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class MoonSandBlock extends FallingBlock {

    public MoonSandBlock() {
        super(Properties.of(Material.SAND).harvestLevel(0).sound(SoundType.SAND).lightLevel(l -> 0).strength(1f,10f));
    }

    public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return 15;
    }
}
