package lib.index.cycholifemod.eventhandler;

import lib.index.cycholifemod.blocks.machine.bonfire.BonfireBlock;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class TorchEventHandler {
	
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void OnTorchPlaceEvent(PlaceEvent event)
	{
	// This event has an Entity variable, access it like this:
	Block block = event.getPlacedBlock().getBlock();

	// do something to player every update tick:
	if (block==Blocks.torch)
		{
		event.setCanceled(false);
		event.getWorld().setBlockState(event.getPos(),Blocks.coal_ore.getDefaultState());
		}
	}
	
	public static void init(){};
	
}
