package com.blackdragon2447.witherproof.util.handelers;

import com.blackdragon2447.witherproof.Main;
import com.blackdragon2447.witherproof.blocks.machines.hardener.TileEntityHardener;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {
	
	public static void registerTileEntities() {
		
		GameRegistry.registerTileEntity(TileEntityHardener.class, new ResourceLocation(Main.MODID, "hardener"));
	}

}
