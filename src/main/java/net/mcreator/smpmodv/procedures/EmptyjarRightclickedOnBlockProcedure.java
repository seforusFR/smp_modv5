package net.mcreator.smpmodv.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.smpmodv.init.SmpModVModBlocks;

public class EmptyjarRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
			(itemstack).setCount((int) ((itemstack).getCount() - 1));
			world.setBlock(new BlockPos(x, y + 1, z), SmpModVModBlocks.GLOWBERRYJAR.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.CAVE_AIR) {
			(itemstack).setCount((int) ((itemstack).getCount() - 1));
			world.setBlock(new BlockPos(x, y + 1, z), SmpModVModBlocks.GLOWBERRYJAR.get().defaultBlockState(), 3);
		}
	}
}
