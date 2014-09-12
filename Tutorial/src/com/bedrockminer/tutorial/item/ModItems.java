package com.bedrockminer.tutorial.item;

import com.bedrockminer.tutorial.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public final class ModItems {

	public static ToolMaterial TUTORIAL = 	EnumHelper.addToolMaterial("TUTORIAL", 	3, 1000, 15.0F, 4.0F, 30);
	public static ArmorMaterial ARMOR = 	EnumHelper.addArmorMaterial("TUTORIAL", 16, new int[] {3, 8, 6, 3}, 30);

	public static Item tutorialItem;
	public static Item metaitem;

	public static Item tutorialPickaxe;
	public static Item tutorialAxe;
	public static Item tutorialSpade;
	public static Item tutorialHoe;
	public static Item tutorialSword;

	public static Item tutorialHelmet;
	public static Item tutorialChestplate;
	public static Item tutorialLeggings;
	public static Item tutorialBoots;

	public static final void init() {
		GameRegistry.registerItem(tutorialItem = new Item().setUnlocalizedName("tutorialItem").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Main.MODID + ":tutorialItem"), "tutorialItem");
		GameRegistry.registerItem(metaitem = new MetaItem("metaitem"), "metaitem");

		GameRegistry.registerItem(tutorialPickaxe	= new ItemModPickaxe("tutorial_pickaxe", TUTORIAL), "tutorial_pickaxe");
		GameRegistry.registerItem(tutorialAxe 		= new ItemModAxe("tutorial_axe", TUTORIAL), "tutorial_axe");
		GameRegistry.registerItem(tutorialSpade 	= new ItemModSpade("tutorial_spade", TUTORIAL), "tutorial_spade");
		GameRegistry.registerItem(tutorialHoe	 	= new ItemModHoe("tutorial_hoe", TUTORIAL), "tutorial_hoe");
		GameRegistry.registerItem(tutorialSword 	= new ItemModSword("tutorial_sword", TUTORIAL), "tutorial_sword");

		//Armor
		GameRegistry.registerItem(tutorialHelmet	= new ItemModArmor("tutorial_helmet", ARMOR, "tutorial", 0), "tutorial_helmet");
		GameRegistry.registerItem(tutorialChestplate= new ItemModArmor("tutorial_chestplate", ARMOR, "tutorial", 1), "tutorial_chestplate");
		GameRegistry.registerItem(tutorialLeggings	= new ItemModArmor("tutorial_leggings", ARMOR, "tutorial", 2), "tutorial_leggings");
		GameRegistry.registerItem(tutorialBoots		= new ItemModArmor("tutorial_boots", ARMOR, "tutorial", 3), "tutorial_boots");
	}
}
