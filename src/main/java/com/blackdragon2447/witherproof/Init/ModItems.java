package com.blackdragon2447.witherproof.Init;

import java.util.ArrayList;
import java.util.List;

import com.blackdragon2447.witherproof.items.ItemBase;
import com.blackdragon2447.witherproof.items.MortarAndPestle;
import com.blackdragon2447.witherproof.items.tools.ToolAxe;
import com.blackdragon2447.witherproof.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new  ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_REINFORCED_DIAMOND =EnumHelper.addToolMaterial("reinforced_diamond", 0, 2000, 2.0F, 2.0F, 0);
	
	//items
	public static final Item REINFORCEMENT = new ItemBase("reinforcement");
	public static final Item HARDENEDDIAMOND = new ItemBase("hardened_diamond");
	public static final Item HARDENEDBARS = new ItemBase("hardened_bars");
	public static final Item AXE_HEAD = new ItemBase("axe_head");
	public static final Item MORTAR_AND_PESTLE = new MortarAndPestle("mortar_and_pestle");
	public static final Item FIRE_PROOFING_REAGENT = new ItemBase("fire_proofing_reagent");
	public static final Item HARDENING_REAGENT = new ItemBase("hardening_reagent");
	
	//Tools
	public static final ToolSword REINFORCED_DIAMOND_SWORD = new ToolSword("reinforced_diamond_sword", MATERIAL_REINFORCED_DIAMOND);
	public static final ItemAxe REINFORCED_DIAMOND_AXE = new ToolAxe("reinforced_diamond_axe", MATERIAL_REINFORCED_DIAMOND);
}

