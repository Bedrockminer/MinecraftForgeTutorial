package com.bedrockminer.tutorial.item;

import com.bedrockminer.tutorial.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public final class ModItems {

	public static ToolMaterial TUTORIAL = EnumHelper.addToolMaterial("TUTORIAL", 3, 1000, 15.0F, 4.0F, 30);

	public static Item tutorialItem;
	public static Item metaitem;

	public static Item tutorialPickaxe;
	public static Item tutorialAxe;
	public static Item tutorialSpade;
	public static Item tutorialHoe;
	public static Item tutorialSword;

	public static final void init() {
		GameRegistry.registerItem(tutorialItem = new Item().setUnlocalizedName("tutorialItem").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Main.MODID + ":tutorialItem"), "tutorialItem");
		GameRegistry.registerItem(metaitem = new MetaItem("metaitem"), "metaitem");

		//Sword and Tools
		GameRegistry.registerItem(tutorialPickaxe	= new ItemModPickaxe("tutorial_pickaxe", TUTORIAL), "tutorial_pickaxe");
		GameRegistry.registerItem(tutorialAxe 		= new ItemModAxe("tutorial_axe", TUTORIAL), "tutorial_axe");
		GameRegistry.registerItem(tutorialSpade 	= new ItemModSpade("tutorial_spade", TUTORIAL), "tutorial_spade");
		GameRegistry.registerItem(tutorialHoe	 	= new ItemModHoe("tutorial_hoe", TUTORIAL), "tutorial_hoe");
		GameRegistry.registerItem(tutorialSword 	= new ItemModSword("tutorial_sword", TUTORIAL), "tutorial_sword");
	}
}
