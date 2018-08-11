package frosty.cookiefactorymod.objects.items;

import frosty.cookiefactorymod.Main;
import frosty.cookiefactorymod.init.ItemInit;
import frosty.cookiefactorymod.proxy.ClientProxy;
import frosty.cookiefactorymod.utils.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.COOKIEFACTORY);
		
		ItemInit.ITEMS.add(this);
	}
	@Override
	public void registerModels(){
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}	
}
