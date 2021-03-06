package lib.index.cycholifemod;

import lib.index.cycholifemod.blocks.RegisterRender;
import lib.index.cycholifemod.blocks.machine.bonfire.BonfireBlock;
import lib.index.cycholifemod.blocks.machine.bonfire.BonfireMachine;
import lib.index.cycholifemod.blocks.savagery.SavegeryItems;
import lib.index.cycholifemod.eventhandler.TorchEventHandler;
import lib.index.cycholifemod.iCore.ProjectICreativeTab;
import lib.index.cycholifemod.iCore.ServerProxy;
import lib.index.cycholifemod.items.RegItem;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = CychoLifeMod.MODID, version = CychoLifeMod.VERSION)

public class CychoLifeMod
{
    public static final String MODID = "cycholifemod";
    public static final String VERSION = "0.1";
    
	@Mod.Instance(MODID)
	public static CychoLifeMod instance;
		
	@SidedProxy(clientSide = "lib.index.cycholifemod.iCore.ClientProxy",serverSide = "lib.index.cycholifemod.iCore.ServerProxy")
	public static ServerProxy proxy;
	
    
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		ProjectICreativeTab.initialiseTabs();			
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event) {
		FMLCommonHandler.instance().bus().register(instance);
		FMLCommonHandler.instance().bus().register(new TorchEventHandler() );
		TorchEventHandler.init();
		proxy.init(event);
		BonfireBlock.init();
	}

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }	
	
}
