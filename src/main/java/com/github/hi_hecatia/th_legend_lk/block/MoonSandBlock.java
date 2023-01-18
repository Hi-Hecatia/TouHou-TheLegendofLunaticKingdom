package com.github.hi_hecatia.th_legend_lk.block;

import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class MoonSandBlock extends FallingBlock {
    public MoonSandBlock() {
        super(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SAND).
                strength(1f, 4f).lightLevel(l -> 0));
    }

}
