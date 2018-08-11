package frosty.cookiefactorymod.init;

import java.util.ArrayList;
import java.util.List;

import frosty.cookiefactorymod.objects.items.ItemBase;
import net.minecraft.item.Item;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item BRONZE_INGOT = new ItemBase("ingot_bronze");
	public static final Item ROBOT_FRAGMENT = new ItemBase("fragment_robot");
	
	public static final Item BUTTER = new ItemBase("butter");
	public static final Item CACOA_BUTTER = new ItemBase("butter_cacoa");
}
