package com.blackdragon2447.witherproof;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import org.apache.logging.log4j.Logger;

import com.blackdragon2447.witherproof.Init.ModBlocks;
import com.blackdragon2447.witherproof.Init.ModRecipes;
import com.blackdragon2447.witherproof.proxy.CommonProxy;
import com.blackdragon2447.witherproof.util.handelers.GuiHandler;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main{
	
    public static final String MODID = "witherproof";
    public static final String NAME = "Wither proof";
    public static final String VERSION = "1.0";
    public static final String ACCEPTED_VERSIONS = "[1.12.2]";
    public static final String CLIENT_PROXY_CLASS = "com.blackdragon2447.witherproof.proxy.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "com.blackdragon2447.witherproof.proxy.CommonProxy";
    
    
    
    @Instance("witherproof")
    public static Main instance;
    
    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = COMMON_PROXY_CLASS)
    public static CommonProxy proxy;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	

    }

    @EventHandler
    public void init(FMLInitializationEvent event){
       ModRecipes.init();
       NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());

    }
    
    @EventHandler
    public void init(FMLPostInitializationEvent event){
       
    	
    }
    
    
}

