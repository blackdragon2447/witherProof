package com.blackdragon2447.witherproof.Init;

import java.util.ArrayList;
import java.util.List;

import com.blackdragon2447.witherproof.Main;
import com.blackdragon2447.witherproof.enchantments.EnchantementWitherBane;
import com.blackdragon2447.witherproof.items.tools.ToolAxe;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemShield;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.util.EnumHelper;


@Mod.EventBusSubscriber(modid=Main.MODID)
public class ModEnchantments {
	
	public static final List<Enchantment> ENCHANTMENTS = new ArrayList<Enchantment>();
	
	
	public static final Enchantment WITHER_BANE = new EnchantementWitherBane();
	
	@SubscribeEvent
	public static void witherBaneFunction(LivingUpdateEvent event) {
		
		EntityLivingBase living =event.getEntityLiving();
		int level = EnchantmentHelper.getMaxEnchantmentLevel(WITHER_BANE, living);
		BlockPos pos = living.getPosition();
		World world = event.getEntity().world;
		
		
	}
	
    


}
