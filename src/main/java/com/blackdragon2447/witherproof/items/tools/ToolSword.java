package com.blackdragon2447.witherproof.items.tools;

import java.util.Random;
import java.util.Set;

import com.blackdragon2447.witherproof.Main;
import com.blackdragon2447.witherproof.Init.ModItems;
import com.blackdragon2447.witherproof.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.util.DamageSource;

public class ToolSword extends ItemSword implements IHasModel{
	
	public float Damage;

	public ToolSword(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
	

	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
	@Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {

		
		if(target instanceof EntityWither) {
			Damage = 15.0F;
		}
		else {
			Damage = 2.0F;
		}
		
        target.attackEntityFrom(DamageSource.GENERIC, Damage);

        return true;
    }

}

