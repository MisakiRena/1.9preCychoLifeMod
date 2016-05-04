package lib.index.cycholifemod.iCore;

import lib.index.cycholifemod.CychoLifeMod;
import lib.index.cycholifemod.blocks.machine.bonfire.ContainerBonfire;
import lib.index.cycholifemod.blocks.machine.bonfire.GuiBonfire;
import lib.index.cycholifemod.blocks.machine.bonfire.TileEntityBonfire;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;


public class CycGuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if (ID==0) {	return null;}
		TileEntityBonfire tileEntityBonfire = (TileEntityBonfire) world.getTileEntity(new BlockPos(x,y,z));
		switch(ID)
		{
			case 1:		return new ContainerBonfire(player.inventory, tileEntityBonfire);
			default :	return null;
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if (ID==0) {	return null;}
		TileEntityBonfire tileEntityBonfire = (TileEntityBonfire) world.getTileEntity(new BlockPos(x,y,z));
		switch(ID)
		{
			case 1:		return new GuiBonfire(player.inventory, tileEntityBonfire);
			default :	return null;
		}
	}

}