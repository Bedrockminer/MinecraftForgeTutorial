package com.bedrockminer.tutorial.world;

import java.util.Random;

import com.bedrockminer.tutorial.block.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator {

	private WorldGenerator gen_tutorial_ore;	//Generates Tutorial Ore (used in Overworld)
	private WorldGenerator gen_multi_ore;		//Generates Multi Ore (used in Overworld)
	private WorldGenerator gen_cobblestone;		//Generates Cobblestone (used in End)

	public ModWorldGen() {
		this.gen_tutorial_ore = new WorldGenMinable(ModBlocks.tutorial_ore, 8);
		this.gen_multi_ore = new WorldGenSingleMinable(ModBlocks.multi_ore);
		this.gen_cobblestone = new WorldGenMinable(Blocks.cobblestone, 16, Blocks.end_stone);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case 0: //Overworld
			this.runGenerator(this.gen_tutorial_ore, world, random, chunkX * 16, chunkZ * 16, 20, 0, 64);
			this.runGenerator(this.gen_multi_ore, world, random, chunkX * 16, chunkZ * 16, 10, 0, 16);
			break;
		case -1: //Nether

			break;
		case 1: //End
			this.runGenerator(this.gen_cobblestone, world, random, chunkX * 16, chunkZ * 16, 10, 0, 80);
			break;
		}
	}

	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
    	if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
    		throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

    	int heightDiff = maxHeight - minHeight;
    	for (int i = 0; i < chancesToSpawn; i ++) {
    		int x = chunk_X + rand.nextInt(16);
    		int y = minHeight + rand.nextInt(heightDiff);
    		int z = chunk_Z + rand.nextInt(16);
    		generator.generate(world, rand, x, y, z);
    	}
    }
}
