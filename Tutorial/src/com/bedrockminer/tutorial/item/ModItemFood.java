package com.bedrockminer.tutorial.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.bedrockminer.tutorial.Main;

public class ModItemFood extends ItemFood {

	private PotionEffect[] effects;

	public ModItemFood(String unlocalizedName, int healAmount, float saturationModifier, boolean wolvesFavorite, PotionEffect... effects) {
		super(healAmount, saturationModifier, wolvesFavorite);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.effects = effects;
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		super.onFoodEaten(stack, world, player);

		for (int i = 0; i < this.effects.length; i ++) {
			if (!world.isRemote && this.effects[i] != null && this.effects[i].getPotionID() > 0)
				player.addPotionEffect(this.effects[i]);
		}
	}

}
