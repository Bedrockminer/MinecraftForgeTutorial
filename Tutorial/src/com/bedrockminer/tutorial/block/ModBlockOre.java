package com.bedrockminer.tutorial.block;

import java.util.Random;

import com.bedrockminer.tutorial.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModBlockOre extends Block {

	private Item drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;

	protected ModBlockOre(String unlocalizedName, Material mat, Item drop, int meta, int least_quantity, int most_quantity) {
		super(mat);
		this.drop = drop;
		this.meta = meta;
		this.least_quantity = least_quantity;
		this.most_quantity = most_quantity;
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

	protected ModBlockOre(String unlocalizedName, Material mat, Item drop, int least_quantity, int most_quantity) {
		this(unlocalizedName, mat, drop, 0, least_quantity, most_quantity);
	}

	protected ModBlockOre(String unlocalizedName, Material mat, Item drop) {
		this(unlocalizedName, mat, drop, 1, 1);
	}

	@Override
	public Item getItemDropped(int meta, Random random, int fortune) {
		return this.drop;
	}

	@Override
	public int damageDropped(int meta) {
		return meta;
	}

	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
		if (this.least_quantity >= this.most_quantity)
			return this.least_quantity;
		return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
	}
}
