package com.bedrockminer.tutorial.item;

import com.bedrockminer.tutorial.Main;

import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.common.registry.GameRegistry;


public final class ModItems {

	public static Item chocolate;
	public static Item tutorial_item;

	public static final void init() {
		GameRegistry.registerItem(chocolate = new ModItemFood("chocolate", 2, 0.2f, false, new PotionEffect(Potion.moveSpeed.id, 1200, 1), new PotionEffect(Potion.jump.id, 600, 0), new PotionEffect(Potion.regeneration.id, 200, 1)).setAlwaysEdible(), "chocolate");
		GameRegistry.registerItem(tutorial_item = new Item().setUnlocalizedName("tutorial_item").setTextureName(Main.MODID + ":tutorial_item"), "tutorial_item");
	}
}
