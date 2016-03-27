package ua.pp.shurgent.tfctech.blocks.bc.pipes.fluids;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.ForgeDirection;
import ua.pp.shurgent.tfctech.TFCTech;
import ua.pp.shurgent.tfctech.core.ModPipeIconProvider;
import buildcraft.api.core.IIconProvider;
import buildcraft.transport.pipes.PipeFluidsQuartz;

public class PipeFluidsSterlingSilver extends PipeFluidsQuartz {

	public PipeFluidsSterlingSilver(Item item) {
		super(item);
	}

	@Override
	public IIconProvider getIconProvider() {
		return TFCTech.instance.pipeIconProvider;
	}

	@Override
	public int getIconIndex(ForgeDirection direction) {
		return ModPipeIconProvider.TYPE.PipeFluidsSterlingSilver.ordinal();
	}
}
