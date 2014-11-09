package com.bedrockminer.tutorial.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenSingleMinable extends WorldGenerator {

	private Block block;
	private int blockmeta;
	private Block target;

	public WorldGenSingleMinable(Block block, int meta, Block target) {
		this.block = block;
		this.blockmeta = meta;
		this.target = target;
	}

	public WorldGenSingleMinable(Block block, Block target) {
		this(block, 0, target);
	}

	public WorldGenSingleMinable(Block block) {
		this(block, Blocks.stone);
	}

	@Override
	public boolean generate(World world, Random random, int x, int y, int z) {
		if (world.getBlock(x, y, z).isReplaceableOreGen(world, x, y, z, this.target))
			world.setBlock(x, y, z, this.block, this.blockmeta, 2);
		return true;
	}
}
