package com.bedrockminer.tutorial.block.itemblock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemBlockMetaBlock extends ItemBlockWithMetadata {

	public ItemBlockMetaBlock(Block block) {
		super(block, block);
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		switch (stack.getItemDamage()) {
		case 0:
			return this.getUnlocalizedName() + "_white";
		case 1:
			return this.getUnlocalizedName() + "_black";
		case 2:
			return this.getUnlocalizedName() + "_red";
		case 3:
			return this.getUnlocalizedName() + "_green";
		case 4:
			return this.getUnlocalizedName() + "_yellow";
		case 5:
			return this.getUnlocalizedName() + "_blue";
		default:
			return this.getUnlocalizedName();
		}
	}

}
