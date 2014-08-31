package com.bedrockminer.tutorial.item;

import com.bedrockminer.tutorial.Main;

import net.minecraft.item.ItemHoe;

public class ItemModHoe extends ItemHoe {

	public ItemModHoe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}

}
