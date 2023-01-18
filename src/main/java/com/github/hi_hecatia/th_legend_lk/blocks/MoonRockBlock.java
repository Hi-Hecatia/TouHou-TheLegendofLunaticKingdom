package com.github.hi_hecatia.th_legend_lk.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.loot.LootContext;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.Collections;
import java.util.List;


public class MoonRockBlock extends Block {

    public MoonRockBlock() {
        super(Properties.of(Material.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE).strength(1f, 10f).lightLevel(l -> 0).sound(SoundType.STONE));
    }

    public void getDropBlock(World world, BlockPos pos, PlayerEntity player, BlockState state) {
        ItemStack itemStack = player.getItemInHand(Hand.MAIN_HAND);
        if (itemStack.getItem() instanceof ToolItem) {

        }
        getDropBlock(world, pos, player, state);
    }

    //设置方块不透明度
    public int getBlockOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return 0;
    }
}
