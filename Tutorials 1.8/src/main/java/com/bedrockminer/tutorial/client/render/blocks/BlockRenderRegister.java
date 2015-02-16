package com.bedrockminer.tutorial.client.render.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.bedrockminer.tutorial.Main;
import com.bedrockminer.tutorial.blocks.ModBlocks;

public final class BlockRenderRegister {

	public static String modid = Main.MODID;

	public static void registerBlockRenderer() {
		reg(ModBlocks.tutorialBlock);
	}

	public static void reg(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
