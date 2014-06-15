package com.bedrockminer.tutorial.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.bedrockminer.tutorial.block.itemblock.ItemBlockMetaBlock;

import cpw.mods.fml.common.registry.GameRegistry;

public final class ModBlocks {

	public static Block tutorialBlock;
	public static Block multitexture;
	public static Block metablock;

	public static final void init() {
		GameRegistry.registerBlock(tutorialBlock = new BasicBlock("tutorialBlock", Material.iron), "tutorialBlock");
		GameRegistry.registerBlock(multitexture = new MultitextureBlock("multitexture", Material.cloth), "multitexture");
		GameRegistry.registerBlock(metablock = new MetaBlock("metablock", Material.cloth), ItemBlockMetaBlock.class, "metablock");
	}
}
