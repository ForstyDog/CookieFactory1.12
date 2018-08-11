package frosty.cookiefactorymod.objects.blocks.machines.baking.slots;

import frosty.cookiefactorymod.objects.blocks.machines.baking.TileEntityBakingOven;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotBakingOvenFuel extends Slot{

	public SlotBakingOvenFuel(IInventory inventory, int index, int x, int y) {
		super(inventory, index, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack) {
		return TileEntityBakingOven.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) {
		return super.getItemStackLimit(stack);
	}
}
