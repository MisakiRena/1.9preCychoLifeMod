package lib.index.cycholifemod.blocks.machine.bonfire;

import lib.index.cycholifemod.CychoLifeMod;
import lib.index.cycholifemod.blocks.RegisterRender;
import lib.index.cycholifemod.iCore.ProjectICreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BonfireBlock extends Block{
	
	public static Block BonfireBlock;
	
	
	public BonfireBlock() {
		super(Material.rock);
		this.setUnlocalizedName("BonfireBlock");
		this.setCreativeTab(ProjectICreativeTab.tab_Savagery);
		GameRegistry.registerBlock(this,this.getUnlocalizedName().substring(5));
		RegisterRender.init(this);
	}
	
	@Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
    {
    }
	
	public static void init()
	{
		BonfireBlock = new BonfireBlock();	
	};
}