package frosty.cookiefactorymod;

import frosty.cookiefactorymod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CookieFactroyTab extends CreativeTabs{

	public CookieFactroyTab(String label) {
		super("cookiefactorytab");
	}

	public ItemStack getTabIconItem() { 
		return new ItemStack(ItemInit.CACOA_BUTTER); 
	}
}
