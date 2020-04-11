package com.blackdragon2447.witherproof.blocks.machines.hardener;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.Table;
import com.google.common.collect.Maps;
import com.blackdragon2447.witherproof.Init.ModBlocks;
import com.blackdragon2447.witherproof.Init.ModItems;
import com.google.common.collect.HashBasedTable;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class HardenerRecipes 
{	
	private static final HardenerRecipes INSTANCE = new HardenerRecipes();
	private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
	private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();
	
	public static HardenerRecipes getInstance()
	{
		return INSTANCE;
	}
	
	private HardenerRecipes() 
	{
		addHardeningRecipe(new ItemStack(Blocks.DIAMOND_BLOCK), new ItemStack(ModItems.HARDENING_REAGENT), new ItemStack(ModItems.HARDENEDDIAMOND), 5.0F);
		addHardeningRecipe(new ItemStack(Blocks.IRON_BARS), new ItemStack(ModItems.HARDENING_REAGENT), new ItemStack(ModItems.HARDENEDBARS), 5.0F);
		addHardeningRecipe(new ItemStack(ModBlocks.COMPRESSED_OBSIDIAN), new ItemStack(ModItems.HARDENING_REAGENT), new ItemStack(ModBlocks.TREATED_OBSIDIAN), 5.0F);
	}

	
	public void addHardeningRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience) 
	{
		if(getHardeningResult(input1, input2) != ItemStack.EMPTY) return;
		this.smeltingList.put(input1, input2, result);
		this.experienceList.put(result, Float.valueOf(experience));
	}
	
	public ItemStack getHardeningResult(ItemStack input1, ItemStack input2) 
	{
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.smeltingList.columnMap().entrySet()) 
		{
			if(this.compareItemStacks(input1, (ItemStack)entry.getKey())) 
			{
				for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet()) 
				{
					if(this.compareItemStacks(input2, (ItemStack)ent.getKey())) 
					{
						return (ItemStack)ent.getValue();
					}
				}
			}
		}
		return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
	{
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
	}
	
	public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList() 
	{
		return this.smeltingList;
	}
	
	public float getSinteringExperience(ItemStack stack)
	{
		for (Entry<ItemStack, Float> entry : this.experienceList.entrySet()) 
		{
			if(this.compareItemStacks(stack, (ItemStack)entry.getKey())) 
			{
				return ((Float)entry.getValue()).floatValue();
			}
		}
		return 0.0F;
	}
}