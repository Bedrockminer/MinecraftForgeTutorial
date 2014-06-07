package com.bedrockminer.tutorial.block;

import com.bedrockminer.tutorial.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class MultitextureBlock extends Block {

	public IIcon[] icons = new IIcon[6];

	protected MultitextureBlock(String unlocalizedName, Material material) {
		super(material);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(2.0F);
		this.setResistance(6.0F);
		this.setStepSound(soundTypeGravel);
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return this.icons[side];
	}

	@Override
	public void registerBlockIcons(IIconRegister reg) {
		for (int i = 0; i < 6; i ++) {
			this.icons[i] = reg.registerIcon(this.textureName + "_" + i);
		}
	}

}
