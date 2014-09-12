package com.bedrockminer.tutorial.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.bedrockminer.tutorial.Main;

public class ItemModArmor extends ItemArmor {

	private String textureName;

	public ItemModArmor(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
		super(material, 0, type);
		this.textureName = textureName;
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		return Main.MODID + ":armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(ModItems.tutorialLeggings))
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40));
	}

}
