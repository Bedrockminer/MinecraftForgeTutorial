package com.bedrockminer.tutorial;

import com.bedrockminer.tutorial.proxies.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Main.MODID, name=Main.NAME, version=Main.VERSION)
public class Main {

	public static final String MODID = "tutorial";
	public static final String NAME = "Tutorial Mod 1.8";
	public static final String VERSION = "1.0.0";

	@Instance
	public static Main instance = new Main();

	@SidedProxy(clientSide="com.bedrockminer.tutorial.proxies.ClientProxy", serverSide="com.bedrockminer.tutorial.proxies.ServerProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void onPreInit(FMLPreInitializationEvent e) {
		this.proxy.preInit(e);
	}

	@EventHandler
	public void onInit(FMLInitializationEvent e) {
		this.proxy.init(e);
	}

	@EventHandler
	public void onPostInit(FMLPostInitializationEvent e) {
		this.proxy.postInit(e);
	}
}
