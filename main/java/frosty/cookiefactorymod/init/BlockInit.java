package frosty.cookiefactorymod.init;

import java.util.ArrayList;
import java.util.List;

import frosty.cookiefactorymod.objects.blocks.BlockBase;
import frosty.cookiefactorymod.objects.blocks.BlockOres;
import frosty.cookiefactorymod.objects.blocks.machines.baking.BlockBakingOven;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_BRONZE = new BlockBase("block_bronze", Material.IRON);
	
	public static final Block ORE_END = new BlockOres("ore_end", "end"); 
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
	
	public static final Block BAKING_OVEN = new BlockBakingOven("baking_oven");
}
