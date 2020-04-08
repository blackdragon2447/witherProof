package com.blackdragon2447.witherproof.blocks;

import javax.annotation.Nonnull;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class ReinforcedObsidian extends BlockBase{

	public ReinforcedObsidian(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(60.0F);
		setResistance(8000.0F);
		setHarvestLevel("pickaxe", 3);
		
		
	}
	
	  public boolean canEntityDestroy(@Nonnull IBlockState state, @Nonnull IBlockAccess world, @Nonnull BlockPos pos, @Nonnull Entity entity) {
		    return (!(entity instanceof net.minecraft.entity.boss.EntityWither) && !(entity instanceof net.minecraft.entity.projectile.EntityWitherSkull));
		  }

}

