package lib.index.cycholifemod.blocks.machine.bonfire;

import lib.index.cycholifemod.blocks.RegisterRender;
import lib.index.cycholifemod.iCore.ProjectICreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BonfireBlock extends Block{
	
	public static Block BonfireBlock;
	public static Block BonfireMachine;
	public static Block lit_BonfireMachine;
	
	public BonfireBlock() {
		super(Material.rock);
		this.setUnlocalizedName("Bonfire_Block");
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
		BonfireMachine =new BonfireMachine("Bonfire_Machine",false).setCreativeTab(ProjectICreativeTab.tab_Savagery);
		lit_BonfireMachine = new BonfireMachine("lit_Bonfire_Machine",true);
	};
}
