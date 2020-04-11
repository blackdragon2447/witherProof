package com.blackdragon2447.witherproof.util.handelers;

import com.blackdragon2447.witherproof.Main;
import com.blackdragon2447.witherproof.blocks.machines.hardener.ContainerHarderner;
import com.blackdragon2447.witherproof.blocks.machines.hardener.GuiHardener;
import com.blackdragon2447.witherproof.blocks.machines.hardener.TileEntityHardener;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{
	
	public enum GUI_ENUM 
    {
        HARDENER, EMPTY
    }
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		//System.out.println(ID);
		//System.out.println("test------------------------------------------------");
		if(ID == GUI_ENUM.HARDENER.ordinal()) return new ContainerHarderner(player.inventory, (TileEntityHardener) world.getTileEntity(new BlockPos(x, y, z)));
		return null;
	}
	
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		//System.out.println(ID);
		//System.out.println("test------------------------------------------------");
		if(ID == GUI_ENUM.HARDENER.ordinal()) return new GuiHardener(player.inventory, (TileEntityHardener)world.getTileEntity(new BlockPos(x, y, z)));
		return null;
	}

}
