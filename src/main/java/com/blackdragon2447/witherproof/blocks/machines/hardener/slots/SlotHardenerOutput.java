package com.blackdragon2447.witherproof.blocks.machines.hardener.slots;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotHardenerOutput extends Slot {
	
	private final EntityPlayer player;
	private int removeCount;

	public SlotHardenerOutput(IInventory inventory, int index, int x, int y, EntityPlayer player) {
		super(inventory, index, x, y);
		this.player = player;
			
	}
	
	@Override
	public boolean isItemValid(ItemStack stack) {
		
		return false;
	}

	@Override
	public ItemStack onTake(EntityPlayer thePlayer, ItemStack stack) {
		
		this.onCrafting(stack);
		super.onTake(thePlayer, stack);
		return stack;
	}
	
	@Override
	public ItemStack decrStackSize(int amount) {
		
		if(this.getHasStack()) this.removeCount += Math.min(amount, this.getStack().getCount());
		return super.decrStackSize(amount);
	}
}
