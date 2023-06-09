
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theeommod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.theeommod.item.ZombiePigmanItem;
import net.mcreator.theeommod.item.WormholeItem;
import net.mcreator.theeommod.item.WindItem;
import net.mcreator.theeommod.item.WaterItem;
import net.mcreator.theeommod.item.TrapItem;
import net.mcreator.theeommod.item.TheFlintstonesItem;
import net.mcreator.theeommod.item.SteamItem;
import net.mcreator.theeommod.item.SpaceItem;
import net.mcreator.theeommod.item.SnowItem;
import net.mcreator.theeommod.item.SingularityItem;
import net.mcreator.theeommod.item.SeafoodItem;
import net.mcreator.theeommod.item.SeaItem;
import net.mcreator.theeommod.item.SandElementItem;
import net.mcreator.theeommod.item.RockItem;
import net.mcreator.theeommod.item.PuddleItem;
import net.mcreator.theeommod.item.PressureItem;
import net.mcreator.theeommod.item.PortalItem;
import net.mcreator.theeommod.item.PondItem;
import net.mcreator.theeommod.item.PlanktonItem;
import net.mcreator.theeommod.item.OceanItem;
import net.mcreator.theeommod.item.ObsidianItem;
import net.mcreator.theeommod.item.NothingItem;
import net.mcreator.theeommod.item.NetherPortalItem;
import net.mcreator.theeommod.item.NetherItemItem;
import net.mcreator.theeommod.item.MudItem;
import net.mcreator.theeommod.item.MetalItem;
import net.mcreator.theeommod.item.LifeItem;
import net.mcreator.theeommod.item.LensItem;
import net.mcreator.theeommod.item.LavaItem;
import net.mcreator.theeommod.item.LakeItem;
import net.mcreator.theeommod.item.InfinitePortalLoopItem;
import net.mcreator.theeommod.item.IcedWaterItem;
import net.mcreator.theeommod.item.IceItem;
import net.mcreator.theeommod.item.HydraulicsItem;
import net.mcreator.theeommod.item.HeatItem;
import net.mcreator.theeommod.item.GravityItem;
import net.mcreator.theeommod.item.GravelElementItem;
import net.mcreator.theeommod.item.GlassElementItem;
import net.mcreator.theeommod.item.FlyingFishItem;
import net.mcreator.theeommod.item.FlintElementItem;
import net.mcreator.theeommod.item.FlintAndSteelItem;
import net.mcreator.theeommod.item.FishItem;
import net.mcreator.theeommod.item.FireItem;
import net.mcreator.theeommod.item.ExtinctionItem;
import net.mcreator.theeommod.item.EnergyItem;
import net.mcreator.theeommod.item.ElementsItem;
import net.mcreator.theeommod.item.EarthquakeItem;
import net.mcreator.theeommod.item.EarthItem;
import net.mcreator.theeommod.item.DustItem;
import net.mcreator.theeommod.item.DuckItem;
import net.mcreator.theeommod.item.DeathItem;
import net.mcreator.theeommod.item.ColdItem;
import net.mcreator.theeommod.item.ClayItem;
import net.mcreator.theeommod.item.BrickItem;
import net.mcreator.theeommod.item.BlackHoleItem;
import net.mcreator.theeommod.item.BirdItem;
import net.mcreator.theeommod.item.AirItem;
import net.mcreator.theeommod.EommodMod;

public class EommodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EommodMod.MODID);
	public static final RegistryObject<Item> AIR = REGISTRY.register("air", () -> new AirItem());
	public static final RegistryObject<Item> EARTH = REGISTRY.register("earth", () -> new EarthItem());
	public static final RegistryObject<Item> FIRE = REGISTRY.register("fire", () -> new FireItem());
	public static final RegistryObject<Item> WATER = REGISTRY.register("water", () -> new WaterItem());
	public static final RegistryObject<Item> DUST = REGISTRY.register("dust", () -> new DustItem());
	public static final RegistryObject<Item> LAVA = REGISTRY.register("lava", () -> new LavaItem());
	public static final RegistryObject<Item> ROCK = REGISTRY.register("rock", () -> new RockItem());
	public static final RegistryObject<Item> GRAVEL_ELEMENT = REGISTRY.register("gravel_element", () -> new GravelElementItem());
	public static final RegistryObject<Item> PUDDLE = REGISTRY.register("puddle", () -> new PuddleItem());
	public static final RegistryObject<Item> FLINT_ELEMENT = REGISTRY.register("flint_element", () -> new FlintElementItem());
	public static final RegistryObject<Item> SAND_ELEMENT = REGISTRY.register("sand_element", () -> new SandElementItem());
	public static final RegistryObject<Item> THE_FLINTSTONES = REGISTRY.register("the_flintstones", () -> new TheFlintstonesItem());
	public static final RegistryObject<Item> HEAT = REGISTRY.register("heat", () -> new HeatItem());
	public static final RegistryObject<Item> GRAVITY = REGISTRY.register("gravity", () -> new GravityItem());
	public static final RegistryObject<Item> PRESSURE = REGISTRY.register("pressure", () -> new PressureItem());
	public static final RegistryObject<Item> WIND = REGISTRY.register("wind", () -> new WindItem());
	public static final RegistryObject<Item> ENERGY = REGISTRY.register("energy", () -> new EnergyItem());
	public static final RegistryObject<Item> HYDRAULICS = REGISTRY.register("hydraulics", () -> new HydraulicsItem());
	public static final RegistryObject<Item> STEAM = REGISTRY.register("steam", () -> new SteamItem());
	public static final RegistryObject<Item> COLD = REGISTRY.register("cold", () -> new ColdItem());
	public static final RegistryObject<Item> ELEMENTS = REGISTRY.register("elements", () -> new ElementsItem());
	public static final RegistryObject<Item> EARTHQUAKE = REGISTRY.register("earthquake", () -> new EarthquakeItem());
	public static final RegistryObject<Item> ICE = REGISTRY.register("ice", () -> new IceItem());
	public static final RegistryObject<Item> BLACK_HOLE = REGISTRY.register("black_hole", () -> new BlackHoleItem());
	public static final RegistryObject<Item> SINGULARITY = REGISTRY.register("singularity", () -> new SingularityItem());
	public static final RegistryObject<Item> WORMHOLE = REGISTRY.register("wormhole", () -> new WormholeItem());
	public static final RegistryObject<Item> PORTAL = REGISTRY.register("portal", () -> new PortalItem());
	public static final RegistryObject<Item> MUD = REGISTRY.register("mud", () -> new MudItem());
	public static final RegistryObject<Item> INFINITE_PORTAL_LOOP = REGISTRY.register("infinite_portal_loop", () -> new InfinitePortalLoopItem());
	public static final RegistryObject<Item> TRAP = REGISTRY.register("trap", () -> new TrapItem());
	public static final RegistryObject<Item> CLAY = REGISTRY.register("clay", () -> new ClayItem());
	public static final RegistryObject<Item> DEATH = REGISTRY.register("death", () -> new DeathItem());
	public static final RegistryObject<Item> POND = REGISTRY.register("pond", () -> new PondItem());
	public static final RegistryObject<Item> METAL = REGISTRY.register("metal", () -> new MetalItem());
	public static final RegistryObject<Item> FLINT_AND_STEEL = REGISTRY.register("flint_and_steel", () -> new FlintAndSteelItem());
	public static final RegistryObject<Item> LAKE = REGISTRY.register("lake", () -> new LakeItem());
	public static final RegistryObject<Item> BRICK = REGISTRY.register("brick", () -> new BrickItem());
	public static final RegistryObject<Item> SEA = REGISTRY.register("sea", () -> new SeaItem());
	public static final RegistryObject<Item> OCEAN = REGISTRY.register("ocean", () -> new OceanItem());
	public static final RegistryObject<Item> LIFE = REGISTRY.register("life", () -> new LifeItem());
	public static final RegistryObject<Item> OBSIDIAN = REGISTRY.register("obsidian", () -> new ObsidianItem());
	public static final RegistryObject<Item> BIRD = REGISTRY.register("bird", () -> new BirdItem());
	public static final RegistryObject<Item> FISH = REGISTRY.register("fish", () -> new FishItem());
	public static final RegistryObject<Item> PLANKTON = REGISTRY.register("plankton", () -> new PlanktonItem());
	public static final RegistryObject<Item> NETHER_PORTAL = REGISTRY.register("nether_portal", () -> new NetherPortalItem());
	public static final RegistryObject<Item> SEAFOOD = REGISTRY.register("seafood", () -> new SeafoodItem());
	public static final RegistryObject<Item> FLYING_FISH = REGISTRY.register("flying_fish", () -> new FlyingFishItem());
	public static final RegistryObject<Item> NETHER_ITEM = REGISTRY.register("nether_item", () -> new NetherItemItem());
	public static final RegistryObject<Item> DUCK = REGISTRY.register("duck", () -> new DuckItem());
	public static final RegistryObject<Item> ZOMBIE_PIGMAN = REGISTRY.register("zombie_pigman", () -> new ZombiePigmanItem());
	public static final RegistryObject<Item> ICED_WATER = REGISTRY.register("iced_water", () -> new IcedWaterItem());
	public static final RegistryObject<Item> SNOW = REGISTRY.register("snow", () -> new SnowItem());
	public static final RegistryObject<Item> EXTINCTION = REGISTRY.register("extinction", () -> new ExtinctionItem());
	public static final RegistryObject<Item> NOTHING = REGISTRY.register("nothing", () -> new NothingItem());
	public static final RegistryObject<Item> SPACE = REGISTRY.register("space", () -> new SpaceItem());
	public static final RegistryObject<Item> GLASS_ELEMENT = REGISTRY.register("glass_element", () -> new GlassElementItem());
	public static final RegistryObject<Item> LENS = REGISTRY.register("lens", () -> new LensItem());
}
