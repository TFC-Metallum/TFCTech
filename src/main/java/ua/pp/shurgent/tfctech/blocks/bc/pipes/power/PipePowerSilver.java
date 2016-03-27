package ua.pp.shurgent.tfctech.blocks.bc.pipes.power;

import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import ua.pp.shurgent.tfctech.TFCTech;
import ua.pp.shurgent.tfctech.core.ModPipeIconProvider;
import buildcraft.api.core.IIconProvider;
import buildcraft.transport.pipes.PipePowerSandstone;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PipePowerSilver extends PipePowerSandstone {

	public PipePowerSilver(Item item) {
		super(item);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIconProvider getIconProvider() {
		return TFCTech.instance.pipeIconProvider;
	}

	@Override
	public int getIconIndex(ForgeDirection direction) {
		return ModPipeIconProvider.TYPE.PipePowerSilver.ordinal();
	}

	@Override
	public boolean canPipeConnect(TileEntity tile, ForgeDirection side) {
		return super.canPipeConnect(tile, side);
	}

	@Override
	public boolean ignoreConnectionOverrides(ForgeDirection with) {
		return super.ignoreConnectionOverrides(with);
	}
}
