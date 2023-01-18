package com.github.hi_hecatia.th_legend_lk.data;

import com.github.hi_hecatia.th_legend_lk.init.ModInitBlocks;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.HashSet;
import java.util.Set;

public class ModBlockLootTable extends BlockLoot {

    private final Set<Block> knownBlocks = new HashSet<>();

    //方块掉落物注册
    @Override
    protected void addTables(){
        dropSelf(ModInitBlocks.MOOONSAND.get());
        dropSelf(ModInitBlocks.MOONROCK.get());
    }

    @Override
    protected void add(Block block, LootTable.Builder builder){
        super.add(block,builder);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return knownBlocks;
    }
}
