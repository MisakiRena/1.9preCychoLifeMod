package lib.index.cycholifemod.iCore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ProjectICreativeTab {
	
	public static final CreativeTabs tab_ProjectI	= new CreativeTabs("ProjectI_Core"){@Override public Item getTabIconItem(){return Item.getItemFromBlock(Blocks.beacon);} };
	public static final CreativeTabs tab_Ore 	 	= new CreativeTabs("ProjectI_Ore") {@Override public Item getTabIconItem(){return Item.getItemFromBlock(Blocks.diamond_ore);} };
	public static final CreativeTabs tab_CityRoad	= new CreativeTabs("CityRoad") 	   {@Override public Item getTabIconItem(){return Items.brick;} };
	public static final CreativeTabs tab_Savagery	= new CreativeTabs("SavageryAge")  {@Override public Item getTabIconItem(){return Item.getItemFromBlock(Blocks.furnace);} };
	
	
	public static void initialiseTabs(){}
}