package frosty.cookiefactorymod.objects.blocks;

import frosty.cookiefactorymod.CookieFactroyTab;
import frosty.cookiefactorymod.Main;
import frosty.cookiefactorymod.init.BlockInit;
import frosty.cookiefactorymod.init.ItemInit;
import frosty.cookiefactorymod.utils.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{

	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.COOKIEFACTORY);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}	
	
	@Override
	public void registerModels(){
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
