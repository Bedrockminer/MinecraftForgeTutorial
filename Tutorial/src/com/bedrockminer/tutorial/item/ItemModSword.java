package com.bedrockminer.tutorial.item;

import net.minecraft.item.ItemSword;

import com.bedrockminer.tutorial.Main;

public class ItemModSword extends ItemSword {

	public ItemModSword(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}

}

