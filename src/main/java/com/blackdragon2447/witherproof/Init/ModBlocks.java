package com.blackdragon2447.witherproof.Init;

import java.util.ArrayList;
import java.util.List;

import com.blackdragon2447.witherproof.blocks.BlockBase;
import com.blackdragon2447.witherproof.blocks.CompressedObsidian;
import com.blackdragon2447.witherproof.blocks.ObsidainFrame;
import com.blackdragon2447.witherproof.blocks.ReinforcedObsidian;
import com.blackdragon2447.witherproof.blocks.machines.hardener.BlockHardener;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block REINFORCED_OBSIDIAN = new ReinforcedObsidian("reinforced_obsidian", Material.ROCK);
	public static final Block COMPRESSED_OBSIDIAN = new CompressedObsidian("compressed_obsidian", Material.ROCK);
	public static final Block TREATED_OBSIDIAN = new CompressedObsidian("treated_obsidian", Material.ROCK);
	public static final Block OBSIDIAN_FRAME = new ObsidainFrame("obsidian_frame", Material.ROCK);
	public static final Block HARDENER = new BlockHardener("hardener");

}
