
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theeommod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TheEomModModTabs {
	public static CreativeModeTab TAB_EOM_MOD;

	public static void load() {
		TAB_EOM_MOD = new CreativeModeTab("tabeom_mod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TheEomModModItems.ELEMENTS.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
