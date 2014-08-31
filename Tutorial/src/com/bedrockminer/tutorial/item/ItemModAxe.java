package com.bedrockminer.tutorial.item;

import com.bedrockminer.tutorial.Main;

import net.minecraft.item.ItemAxe;

public class ItemModAxe extends ItemAxe {

	protected ItemModAxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}

}
