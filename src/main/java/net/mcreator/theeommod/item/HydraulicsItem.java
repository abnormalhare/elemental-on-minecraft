
package net.mcreator.theeommod.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.theeommod.init.EommodModTabs;

public class HydraulicsItem extends Item {
	public HydraulicsItem() {
		super(new Item.Properties().tab(EommodModTabs.TAB_EOM_MOD).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
