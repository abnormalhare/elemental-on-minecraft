
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theeommod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.theeommod.EommodMod;

public class EommodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EommodMod.MODID);
	public static final RegistryObject<CreativeModeTab> EOM_MOD = REGISTRY.register("eom_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.eommod.eom_mod")).icon(() -> new ItemStack(EommodModItems.ELEMENTS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EommodModItems.AIR.get());
				tabData.accept(EommodModItems.EARTH.get());
				tabData.accept(EommodModItems.FIRE.get());
				tabData.accept(EommodModItems.WATER.get());
				tabData.accept(EommodModItems.DUST.get());
				tabData.accept(EommodModItems.LAVA.get());
				tabData.accept(EommodModItems.ROCK.get());
				tabData.accept(EommodModItems.GRAVEL_ELEMENT.get());
				tabData.accept(EommodModItems.PUDDLE.get());
				tabData.accept(EommodModItems.FLINT_ELEMENT.get());
				tabData.accept(EommodModItems.SAND_ELEMENT.get());
				tabData.accept(EommodModItems.THE_FLINTSTONES.get());
				tabData.accept(EommodModItems.HEAT.get());
				tabData.accept(EommodModItems.GRAVITY.get());
				tabData.accept(EommodModItems.PRESSURE.get());
				tabData.accept(EommodModItems.WIND.get());
				tabData.accept(EommodModItems.ENERGY.get());
				tabData.accept(EommodModItems.HYDRAULICS.get());
				tabData.accept(EommodModItems.STEAM.get());
				tabData.accept(EommodModItems.COLD.get());
				tabData.accept(EommodModItems.ELEMENTS.get());
				tabData.accept(EommodModItems.EARTHQUAKE.get());
				tabData.accept(EommodModItems.ICE.get());
				tabData.accept(EommodModItems.BLACK_HOLE.get());
				tabData.accept(EommodModItems.SINGULARITY.get());
				tabData.accept(EommodModItems.WORMHOLE.get());
				tabData.accept(EommodModItems.PORTAL.get());
				tabData.accept(EommodModItems.MUD.get());
				tabData.accept(EommodModItems.INFINITE_PORTAL_LOOP.get());
				tabData.accept(EommodModItems.TRAP.get());
				tabData.accept(EommodModItems.CLAY.get());
				tabData.accept(EommodModItems.DEATH.get());
				tabData.accept(EommodModItems.POND.get());
				tabData.accept(EommodModItems.METAL.get());
				tabData.accept(EommodModItems.FLINT_AND_STEEL.get());
				tabData.accept(EommodModItems.LAKE.get());
				tabData.accept(EommodModItems.BRICK.get());
				tabData.accept(EommodModItems.SEA.get());
				tabData.accept(EommodModItems.OCEAN.get());
				tabData.accept(EommodModItems.LIFE.get());
				tabData.accept(EommodModItems.OBSIDIAN.get());
				tabData.accept(EommodModItems.BIRD.get());
				tabData.accept(EommodModItems.FISH.get());
				tabData.accept(EommodModItems.PLANKTON.get());
				tabData.accept(EommodModItems.NETHER_PORTAL.get());
				tabData.accept(EommodModItems.SEAFOOD.get());
				tabData.accept(EommodModItems.FLYING_FISH.get());
				tabData.accept(EommodModItems.NETHER_ITEM.get());
				tabData.accept(EommodModItems.DUCK.get());
				tabData.accept(EommodModItems.ZOMBIE_PIGMAN.get());
				tabData.accept(EommodModItems.ICED_WATER.get());
				tabData.accept(EommodModItems.SNOW.get());
				tabData.accept(EommodModItems.EXTINCTION.get());
				tabData.accept(EommodModItems.NOTHING.get());
				tabData.accept(EommodModItems.SPACE.get());
				tabData.accept(EommodModItems.GLASS_ELEMENT.get());
				tabData.accept(EommodModItems.LENS.get());
			}).withSearchBar().build());
}
