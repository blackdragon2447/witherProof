package com.blackdragon2447.witherproof.enchantments;

import com.blackdragon2447.witherproof.Main;
import com.blackdragon2447.witherproof.Init.ModEnchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.init.Enchantments;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;

public class EnchantementWitherBane extends Enchantment {

	public EnchantementWitherBane() {
		super(Rarity.VERY_RARE, EnumEnchantmentType.WEAPON, new EntityEquipmentSlot[] {EntityEquipmentSlot.MAINHAND});
		this.setName("wither_bane");
		this.setRegistryName(new ResourceLocation(Main.MODID + ":wither_bane"));
		
		ModEnchantments.ENCHANTMENTS.add(this);
		
	}
	
	@Override
	public int getMinEnchantability(int enchantmentLevel) {
			
		return 20 * enchantmentLevel;
	}
	
	@Override
	public int getMaxEnchantability(int enchantmentLevel) {
		// TODO Auto-generated method stub
		return this.getMinEnchantability(enchantmentLevel) + 10;
	}
	
	@Override
	public int getMaxLevel() {
		
		return 5;
	}
	
	@Override
	protected boolean canApplyTogether(Enchantment ench) {
		
		boolean canCombine = (ench != Enchantments.SMITE) || (ench != Enchantments.SMITE);
		if(ench != Enchantments.SMITE) {
			
			if(ench == Enchantments.BANE_OF_ARTHROPODS) return false;
			else return super.canApplyTogether(ench) && ench != Enchantments.SMITE;
		}
		else return false;
	}
}



