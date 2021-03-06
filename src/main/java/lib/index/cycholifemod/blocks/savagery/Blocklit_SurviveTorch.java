package lib.index.cycholifemod.blocks.savagery;

import lib.index.cycholifemod.CychoLifeMod;
import lib.index.cycholifemod.blocks.BlockCheck;
import lib.index.cycholifemod.blocks.RegisterRender;
import lib.index.cycholifemod.iCore.ProjectICreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Blocklit_SurviveTorch extends BlockTorch{
	
    public Blocklit_SurviveTorch(boolean isLit)
    {
        super();
        this.setUnlocalizedName("lit_SurviveTorch");
        this.setLightLevel(1F);
        this.setCreativeTab(ProjectICreativeTab.tab_Savagery);
        GameRegistry.registerBlock(this,this.getUnlocalizedName().substring(5));
        RegisterRender.init(this);
		// TODO Auto-generated constructor stub
	}
    
    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
    {
        return BlockCheck.OverlappingCheck(worldIn, pos, this, 1, false);
    }
	    
    @Override
    public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn)
    {
    	this.removedByPlayer(this.getDefaultState(), worldIn, pos, playerIn, canSilkHarvest());
    }
    
    public static void init()
    {
    		
    };

}
