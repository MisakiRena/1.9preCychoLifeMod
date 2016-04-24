package lib.index.cycholifemod.blocks.savagery;

import lib.index.cycholifemod.CychoLifeMod;
import lib.index.cycholifemod.blocks.RegisterRender;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockSurviveTorch extends Block {
	
    public BlockSurviveTorch()
    {
		super(Material.wood);
	    this.setUnlocalizedName("SurviveTorch");
        GameRegistry.registerBlock(this,this.getUnlocalizedName().substring(5));
        RegisterRender.init(this);
		// TODO Auto-generated constructor stub
	}



}
