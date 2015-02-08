package com.bedrockminer.tutorial;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Main.MODID, name=Main.NAME, version=Main.VERSION)
public class Main {

	public static final String MODID = "tutorial1.8";
	public static final String NAME = "Tutorial Mod 1.8";
	public static final String VERSION = "1.0.0";

	@Instance
	public static Main instance = new Main();

	@EventHandler
	public void onPreInit(FMLPreInitializationEvent e) {
	}

	@EventHandler
	public void onInit(FMLInitializationEvent e) {
	}

	@EventHandler
	public void onPostInit(FMLPostInitializationEvent e) {
	}
}
