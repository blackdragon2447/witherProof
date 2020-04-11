package com.blackdragon2447.witherproof.items;

import com.blackdragon2447.witherproof.Main;
import com.blackdragon2447.witherproof.Init.ModItems;
import com.blackdragon2447.witherproof.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.property.Properties;
import net.minecraftforge.fluids.capability.ItemFluidContainer;

public class MortarAndPestle extends Item implements IHasModel{
	
	public MortarAndPestle(String name) {
		
		setMaxStackSize(1);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
	@Override
	public Item setContainerItem(Item containerItem) {
		
		return super.setContainerItem(containerItem);
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack stack) {
		ItemStack stack1 = stack.copy();
		return stack1;
	}
	
	@Override
	public boolean hasContainerItem() {
		return true;
	}

}
