package com.blackdragon2447.witherproof.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;


public class CompressedObsidian extends BlockBase{
	public CompressedObsidian(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(30.0F);
		setResistance(4000.0F);
		setHarvestLevel("pickaxe", 3);
		
		
	}
}
