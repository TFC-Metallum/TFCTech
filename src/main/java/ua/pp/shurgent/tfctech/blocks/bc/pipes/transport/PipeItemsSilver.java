package ua.pp.shurgent.tfctech.blocks.bc.pipes.transport;

import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import ua.pp.shurgent.tfctech.TFCTech;
import ua.pp.shurgent.tfctech.blocks.bc.pipes.handlers.PipeItemsInsertionHandler;
import ua.pp.shurgent.tfctech.core.ModPipeIconProvider;
import buildcraft.api.core.IIconProvider;
import buildcraft.transport.IPipeConnectionForced;
import buildcraft.transport.pipes.PipeItemsSandstone;
import buildcraft.transport.pipes.events.PipeEventItem;

public class PipeItemsSilver extends PipeItemsSandstone implements IPipeConnectionForced {

	public PipeItemsSilver(Item item) {
		super(item);
	}

	@Override
	public IIconProvider getIconProvider() {
		return TFCTech.instance.pipeIconProvider;
	}

	@Override
	public int getIconIndex(ForgeDirection direction) {
		return ModPipeIconProvider.TYPE.PipeItemsSilver.ordinal();
	}

	@Override
	public boolean canPipeConnect(TileEntity tile, ForgeDirection side) {
		return super.canPipeConnect(tile, side);
	}

	@Override
	public boolean ignoreConnectionOverrides(ForgeDirection with) {
		return super.ignoreConnectionOverrides(with);
	}

	public void eventHandler(PipeEventItem.Entered event) {
		event.item.setInsertionHandler(PipeItemsInsertionHandler.INSTANCE);
	}
}
