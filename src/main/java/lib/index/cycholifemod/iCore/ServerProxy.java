package lib.index.cycholifemod.iCore;

import lib.index.cycholifemod.CychoLifeMod;
import lib.index.cycholifemod.blocks.machine.bonfire.TileEntityBonfire;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ServerProxy {
	
	protected ConfigHandler handler;

	public void preInit(FMLPreInitializationEvent event) {
		handler = new ConfigHandler(event);	
		handler.startConfig();
		handler.endConfig();
		registerNetworkStuff();
		registerTileEntities();
	}
	
	public void registerNetworkStuff(){
		NetworkRegistry.INSTANCE.registerGuiHandler(CychoLifeMod.instance, new CycGuiHandler());
	}
	
	public void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityBonfire.class, "TileEntityBonfire");
	}
	
	public void init(FMLInitializationEvent event){};
	
	
}
