package com.github.hi_hecatia.th_legend_lk.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class MoonRockBlock extends Block {
    public MoonRockBlock() {
        super(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().sound(SoundType.STONE).
                strength(2f, 8f).lightLevel(l -> 0));
    }

}
