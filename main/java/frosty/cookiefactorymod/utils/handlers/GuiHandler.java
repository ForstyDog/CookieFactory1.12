package frosty.cookiefactorymod.utils.handlers;

import frosty.cookiefactorymod.objects.blocks.machines.baking.ContainerBakingOven;
import frosty.cookiefactorymod.objects.blocks.machines.baking.GuiBakingOven;
import frosty.cookiefactorymod.objects.blocks.machines.baking.TileEntityBakingOven;
import frosty.cookiefactorymod.utils.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_BAKING_OVEN) return new ContainerBakingOven(player.inventory, (TileEntityBakingOven)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_BAKING_OVEN) return new GuiBakingOven(player.inventory, (TileEntityBakingOven)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

}
