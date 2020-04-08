package com.blackdragon2447.witherproof.proxy;

import com.blackdragon2447.witherproof.Main;
import com.blackdragon2447.witherproof.util.handelers.GuiHandler;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
	 public void init(FMLInitializationEvent e) {
	     NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
	 }
	 
}
