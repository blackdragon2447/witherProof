package com.blackdragon2447.witherproof.items.tools;

import java.util.List;

import javax.swing.text.html.parser.Entity;

import com.blackdragon2447.witherproof.Main;
import com.blackdragon2447.witherproof.Init.ModItems;
import com.blackdragon2447.witherproof.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.util.Constants.NBT;

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

		NBTTagCompound nbt = stack.getTagCompound();
		int id;
		int lvl;
		
		if (nbt != null)
        {
			
            //System.out.println(nbt.toString());
            String nbtS = nbt.toString();
			String idS = nbtS.substring(18, 20);
			//System.out.println(idS);
			String idS2 = idS.replaceAll("[^0-9]", "");
			//System.out.println(idS2);
			id = Integer.valueOf(idS2);
			//System.out.println(id);
			
			String lvlS = nbtS.substring(12, 13);
			System.out.println(lvlS);
			String lvlS2 = lvlS.replaceAll("[^0-9]", "");
			System.out.println(lvlS2);
			lvl = Integer.valueOf(lvlS2);
			System.out.println(lvl);
                
            if(id == 11) {
            	if(target instanceof EntityWither) Damage = 19.0F  + 2.5F * lvl;
            	else if(target instanceof EntityWitherSkeleton) Damage = 17.0F  + 2.5F * lvl;
            }
            System.out.println(Damage);
        }
		
        if(target instanceof EntityWither) {
        	Damage = 17.0F;
		}
            
        
		else {
			Damage = 4.0F;
		}
		
        target.attackEntityFrom(DamageSource.GENERIC, Damage);

        return true;
    }
	
	@Override
	public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
		
		NBTTagCompound nbt = book.getTagCompound();
		int id = 0;
		String idS = null;
		if (nbt != null)
        {
			
            System.out.println(nbt.toString());
            String nbtS = nbt.toString();
			idS = nbtS.substring(32, 34);
			System.out.println(idS);
			String idS2 = idS.replaceAll("[^0-9]", "");
			System.out.println(idS2);
			id = Integer.valueOf(idS2);
			System.out.println(id);
                
        //        if(id == 11) return true;
            
        }
		
		return id == 11;
		//return true;
		
	}
	
	
	
	
	
	
}
