package ua.pp.shurgent.tfctech.items.frames;

import ua.pp.shurgent.tfctech.items.ItemModMetalItem;
import buildcraft.core.BCCreativeTab;

public class PipeFrameSilver extends ItemModMetalItem {

	public PipeFrameSilver(String m, int amt) {
		super(m, amt, "frames");
		setCreativeTab(BCCreativeTab.get("pipes"));
	}

}
