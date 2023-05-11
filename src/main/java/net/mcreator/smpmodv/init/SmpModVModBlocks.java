
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.smpmodv.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.smpmodv.block.SqueezerBlock;
import net.mcreator.smpmodv.block.SnaildensignBlock;
import net.mcreator.smpmodv.block.Quest4activatorBlock;
import net.mcreator.smpmodv.block.Quest3activatorBlock;
import net.mcreator.smpmodv.block.Quest2activatorBlock;
import net.mcreator.smpmodv.block.Quest1activatorBlock;
import net.mcreator.smpmodv.block.GlowberryjarBlock;
import net.mcreator.smpmodv.block.EmptyjarblockBlock;
import net.mcreator.smpmodv.block.AlchemytableBlock;
import net.mcreator.smpmodv.SmpModVMod;

public class SmpModVModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SmpModVMod.MODID);
	public static final RegistryObject<Block> QUEST_1ACTIVATOR = REGISTRY.register("quest_1activator", () -> new Quest1activatorBlock());
	public static final RegistryObject<Block> QUEST_2ACTIVATOR = REGISTRY.register("quest_2activator", () -> new Quest2activatorBlock());
	public static final RegistryObject<Block> ALCHEMYTABLE = REGISTRY.register("alchemytable", () -> new AlchemytableBlock());
	public static final RegistryObject<Block> EMPTYJARBLOCK = REGISTRY.register("emptyjarblock", () -> new EmptyjarblockBlock());
	public static final RegistryObject<Block> GLOWBERRYJAR = REGISTRY.register("glowberryjar", () -> new GlowberryjarBlock());
	public static final RegistryObject<Block> SQUEEZER = REGISTRY.register("squeezer", () -> new SqueezerBlock());
	public static final RegistryObject<Block> QUEST_3ACTIVATOR = REGISTRY.register("quest_3activator", () -> new Quest3activatorBlock());
	public static final RegistryObject<Block> QUEST_4ACTIVATOR = REGISTRY.register("quest_4activator", () -> new Quest4activatorBlock());
	public static final RegistryObject<Block> SNAILDENSIGN = REGISTRY.register("snaildensign", () -> new SnaildensignBlock());
}
