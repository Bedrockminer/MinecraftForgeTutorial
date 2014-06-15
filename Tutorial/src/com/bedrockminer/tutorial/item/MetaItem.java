package com.bedrockminer.tutorial.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.bedrockminer.tutorial.Main;

public class MetaItem extends Item {

	public IIcon[] icons = new IIcon[6];

	public MetaItem(String unlocalizedName) {
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}

	@Override
	public IIcon getIconFromDamage(int meta) {
		if (meta > 5)
			meta = 0;

		return this.icons[meta];
	}

	@Override
	public void registerIcons(IIconRegister reg) {
		for (int i = 0; i < 6; i ++) {
			this.icons[i] = reg.registerIcon(Main.MODID + ":multitexture_" + i);
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < 6; i ++) {
			list.add(new ItemStack(item, 1, i));
		}
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
