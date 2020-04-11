package com.blackdragon2447.witherproof.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class ObsidainFrame extends BlockBase {
	
	public static final AxisAlignedBB OBSIDAIN_FRAME_AABB = new AxisAlignedBB(0, 0, 0, 1, 1, 1);

	public ObsidainFrame(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(30.0F);
		setResistance(4000.0F);
		setHarvestLevel("pickaxe", 3);
		
		
	}

	
	@Override
	public boolean isOpaqueCube(IBlockState state) {

		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {

		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		
		return OBSIDAIN_FRAME_AABB;
	}
}
