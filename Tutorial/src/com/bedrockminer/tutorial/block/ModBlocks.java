package com.bedrockminer.tutorial.block;

import com.bedrockminer.tutorial.item.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ModBlocks {

	public static Block tutorial_ore;
	public static Block multi_ore;

	public static final void init() {
		GameRegistry.registerBlock(tutorial_ore = new ModBlockOre("tutorial_ore", Material.rock, ModItems.tutorial_item, 2, 4).setHardness(10.0f).setResistance(20.0f), "tutorial_ore");
		GameRegistry.registerBlock(multi_ore = new ModBlockMultiOre("multi_ore", Material.rock), "multi_ore");
	}
}
