package frosty.cookiefactorymod.utils.handlers;

import frosty.cookiefactorymod.objects.blocks.machines.baking.TileEntityBakingOven;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {
		public static void registerTileEntities()
		{
			GameRegistry.registerTileEntity(TileEntityBakingOven.class, "sintering_furnace");
		}
	}
