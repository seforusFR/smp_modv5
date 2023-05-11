
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.smpmodv.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.smpmodv.block.entity.SqueezerTileEntity;
import net.mcreator.smpmodv.block.entity.SnaildensignTileEntity;
import net.mcreator.smpmodv.block.entity.AlchemytableTileEntity;
import net.mcreator.smpmodv.SmpModVMod;

public class SmpModVModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, SmpModVMod.MODID);
	public static final RegistryObject<BlockEntityType<AlchemytableTileEntity>> ALCHEMYTABLE = REGISTRY.register("alchemytable", () -> BlockEntityType.Builder.of(AlchemytableTileEntity::new, SmpModVModBlocks.ALCHEMYTABLE.get()).build(null));
	public static final RegistryObject<BlockEntityType<SqueezerTileEntity>> SQUEEZER = REGISTRY.register("squeezer", () -> BlockEntityType.Builder.of(SqueezerTileEntity::new, SmpModVModBlocks.SQUEEZER.get()).build(null));
	public static final RegistryObject<BlockEntityType<SnaildensignTileEntity>> SNAILDENSIGN = REGISTRY.register("snaildensign", () -> BlockEntityType.Builder.of(SnaildensignTileEntity::new, SmpModVModBlocks.SNAILDENSIGN.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
