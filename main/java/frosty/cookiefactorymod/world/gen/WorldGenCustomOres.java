package frosty.cookiefactorymod.world.gen;

import java.util.Random;

import frosty.cookiefactorymod.init.BlockInit;
import frosty.cookiefactorymod.objects.blocks.BlockOres;
import frosty.cookiefactorymod.utils.handlers.EnumHandler;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator{
	
	private WorldGenerator ore_nether_bronze, ore_nether_robot_fragment, ore_overworld_bronze, ore_overworld_robot_fragment, ore_end_bronze, ore_end_robot_fragment;
	
	public WorldGenCustomOres() {
		ore_nether_bronze = new WorldGenMinable(BlockInit.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.BRONZE), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_overworld_bronze = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.BRONZE), 9, BlockMatcher.forBlock(Blocks.STONE));
		ore_end_bronze = new WorldGenMinable(BlockInit.ORE_END.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.ROBOT_FRAGMENT), 9, BlockMatcher.forBlock(Blocks.END_STONE));
		
		ore_overworld_robot_fragment = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.ROBOT_FRAGMENT), 4, BlockMatcher.forBlock(Blocks.STONE));
		ore_nether_robot_fragment = new WorldGenMinable(BlockInit.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.ROBOT_FRAGMENT),  4, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_end_robot_fragment = new WorldGenMinable(BlockInit.ORE_END.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.ROBOT_FRAGMENT), 4, BlockMatcher.forBlock(Blocks.END_STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
		case -1:
			runGenerator(ore_nether_bronze, world, random, chunkX, chunkZ, 40, 25, 100);
			runGenerator(ore_nether_robot_fragment, world, random, chunkX, chunkZ, 20, 14, 30);
			break;
		
		case 0:
			runGenerator(ore_overworld_bronze, world, random, chunkX, chunkZ, 40, 25, 100);
			runGenerator(ore_overworld_robot_fragment, world, random, chunkX, chunkZ, 20, 14, 30);
			break;
		case 1:
			runGenerator(ore_end_bronze, world, random, chunkX, chunkZ, 40, 0, 256);
			runGenerator(ore_end_robot_fragment, world, random, chunkX, chunkZ, 20, 0, 256);
		}
		
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rdm, int chunkX, int chunkZ, int change, int minHeight, int maxHeight) {
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("ore generated out of bounds!");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < change; i++) {
			int x = chunkX * 16 + rdm.nextInt(16);
			int y = minHeight + rdm.nextInt(heightDiff);
			int z = chunkZ * 16 + rdm.nextInt(16);
			
			gen.generate(world, rdm, new BlockPos(x,y,z));
		}
	}
}
