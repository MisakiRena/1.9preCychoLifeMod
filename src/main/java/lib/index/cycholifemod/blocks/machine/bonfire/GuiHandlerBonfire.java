package lib.index.cycholifemod.blocks.machine.bonfire;

import lib.index.cycholifemod.CychoLifeMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;


public class GuiHandlerBonfire implements IGuiHandler {

	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if( ID != 0)
		{
			TileEntityBonfire tileEntityBonfire = (TileEntityBonfire) world.getTileEntity(new BlockPos(x,y,z));
			return new ContainerBonfire(player.inventory, tileEntityBonfire);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID != 0)
		{
			TileEntityBonfire tileEntityBonfire = (TileEntityBonfire) world.getTileEntity(new BlockPos(x,y,z));
			return new GuiBonfire(player.inventory, tileEntityBonfire);
		}
		return null;
	}

}
