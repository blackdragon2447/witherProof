package com.blackdragon2447.witherproof.items.tools;

import com.blackdragon2447.witherproof.Main;
import com.blackdragon2447.witherproof.Init.ModItems;
import com.blackdragon2447.witherproof.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

public class ToolAxe extends ItemAxe implements IHasModel{
	
	public float Damage;

	public ToolAxe(String name, ToolMaterial material ) {
		super(material, 6.0F, -3.2F);
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
			Damage = 17.0F;
		}
		else {
			Damage = 4.0F;
		}
		
        target.attackEntityFrom(DamageSource.GENERIC, Damage);

        return true;
    }
	
}
