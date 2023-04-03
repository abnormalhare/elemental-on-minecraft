
package net.mcreator.theeommod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.theeommod.init.TheEomModModTabs;

public class NetherPortalItem extends Item {
	public NetherPortalItem() {
		super(new Item.Properties().tab(TheEomModModTabs.TAB_EOM_MOD).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		return new ItemStack(this);
	}
}
