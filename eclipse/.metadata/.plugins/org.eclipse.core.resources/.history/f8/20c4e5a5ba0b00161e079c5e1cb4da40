package lib.index.cycholifemod.blocks;

import lib.index.cycholifemod.CychoLifeMod;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RegisterRender {
	
	
	@SideOnly(Side.CLIENT)
	public static void init(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(CychoLifeMod.MODID+":"+item.getUnlocalizedName().substring(5),"inventory"));

	}

}
