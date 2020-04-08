package com.blackdragon2447.witherproof.blocks.machines.hardener.slots;

import com.blackdragon2447.witherproof.blocks.machines.hardener.TileEntityHardener;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotHardenerFuel extends Slot{

	public SlotHardenerFuel(IInventory inventory, int index, int x, int y) {
		super(inventory, index, x, y);
		
	}

	@Override
	public boolean isItemValid(ItemStack stack) {
		
		return TileEntityHardener.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) {
		
		return super.getItemStackLimit(stack);
	}
	

}
