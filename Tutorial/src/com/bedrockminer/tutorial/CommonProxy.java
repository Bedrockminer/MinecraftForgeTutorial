package com.bedrockminer.tutorial;

import com.bedrockminer.tutorial.block.ModBlocks;
import com.bedrockminer.tutorial.item.ModItems;
import com.bedrockminer.tutorial.world.ModWorldGen;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ModItems.init();
		ModBlocks.init();
	}

	public void init(FMLInitializationEvent e) {
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}
