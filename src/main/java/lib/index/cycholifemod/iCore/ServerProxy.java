package lib.index.cycholifemod.iCore;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ServerProxy {
	
	protected ConfigHandler handler;

	public void preInit(FMLPreInitializationEvent event) {
		handler = new ConfigHandler(event);	
		handler.startConfig();
		handler.endConfig();
	}
	public void init(FMLInitializationEvent event){};
}