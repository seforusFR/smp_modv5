
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.smpmodv.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.smpmodv.item.QuesteraserItem;
import net.mcreator.smpmodv.item.HermitcrabscutItem;
import net.mcreator.smpmodv.item.GlowberriejuiceItem;
import net.mcreator.smpmodv.item.AmethystnecklaceItem;
import net.mcreator.smpmodv.item.AmethystdustItem;
import net.mcreator.smpmodv.block.display.SqueezerDisplayItem;
import net.mcreator.smpmodv.block.display.SnaildensignDisplayItem;
import net.mcreator.smpmodv.block.display.AlchemytableDisplayItem;
import net.mcreator.smpmodv.SmpModVMod;

public class SmpModVModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SmpModVMod.MODID);
	public static final RegistryObject<Item> LUSHHERMITCRAB_SPAWN_EGG = REGISTRY.register("lushhermitcrab_spawn_egg", () -> new ForgeSpawnEggItem(SmpModVModEntities.LUSHHERMITCRAB, -52, -26317, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HERMITCRABSCUT = REGISTRY.register("hermitcrabscut", () -> new HermitcrabscutItem());
	public static final RegistryObject<Item> BLSSOMCREATURE_SPAWN_EGG = REGISTRY.register("blssomcreature_spawn_egg",
			() -> new ForgeSpawnEggItem(SmpModVModEntities.BLSSOMCREATURE, -13382656, -3407668, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> LUSHGOBLIN_SPAWN_EGG = REGISTRY.register("lushgoblin_spawn_egg", () -> new ForgeSpawnEggItem(SmpModVModEntities.LUSHGOBLIN, -16764160, -13408768, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> QUEST_1ACTIVATOR = block(SmpModVModBlocks.QUEST_1ACTIVATOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> QUESTERASER = REGISTRY.register("questeraser", () -> new QuesteraserItem());
	public static final RegistryObject<Item> AMETHYSTNECKLACE_CHESTPLATE = REGISTRY.register("amethystnecklace_chestplate", () -> new AmethystnecklaceItem.Chestplate());
	public static final RegistryObject<Item> QUEST_2ACTIVATOR = block(SmpModVModBlocks.QUEST_2ACTIVATOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> AMETHYSTDUST = REGISTRY.register("amethystdust", () -> new AmethystdustItem());
	public static final RegistryObject<Item> ALCHEMYTABLE = REGISTRY.register(SmpModVModBlocks.ALCHEMYTABLE.getId().getPath(),
			() -> new AlchemytableDisplayItem(SmpModVModBlocks.ALCHEMYTABLE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<Item> GLOWBERRIEJUICE = REGISTRY.register("glowberriejuice", () -> new GlowberriejuiceItem());
	public static final RegistryObject<Item> EMPTYJARBLOCK = block(SmpModVModBlocks.EMPTYJARBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GLOWBERRYJAR = block(SmpModVModBlocks.GLOWBERRYJAR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SQUEEZER = REGISTRY.register(SmpModVModBlocks.SQUEEZER.getId().getPath(), () -> new SqueezerDisplayItem(SmpModVModBlocks.SQUEEZER.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	public static final RegistryObject<Item> QUEST_3ACTIVATOR = block(SmpModVModBlocks.QUEST_3ACTIVATOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> QUEST_4ACTIVATOR = block(SmpModVModBlocks.QUEST_4ACTIVATOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SNAILDENSIGN = REGISTRY.register(SmpModVModBlocks.SNAILDENSIGN.getId().getPath(),
			() -> new SnaildensignDisplayItem(SmpModVModBlocks.SNAILDENSIGN.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
