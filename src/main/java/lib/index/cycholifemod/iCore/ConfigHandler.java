package lib.index.cycholifemod.iCore;

import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler {

	private static final String IndexLibString = "IndexLib";
	private static Configuration config;
	
	public ConfigHandler(FMLPreInitializationEvent event) {
		config = new Configuration(event.getSuggestedConfigurationFile());
	}
	
	public void startConfig() {	
		config.load();
		config.addCustomCategoryComment(IndexLibString,"�����A�o�ӥ@�ɡC");
	}
	
	public void endConfig() {
		if(config.hasChanged()) {config.save();}
	}
}
