package com.bedrockminer.tutorial.item;

import com.bedrockminer.tutorial.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class ModItems {

	public static Item tutorialItem;
	public static Item metaitem;

	public static final void init() {
		GameRegistry.registerItem(tutorialItem = new Item().setUnlocalizedName("tutorialItem").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Main.MODID + ":tutorialItem"), "tutorialItem");

		GameRegistry.registerItem(metaitem = new MetaItem("metaitem"), "metaitem");
	}

}
