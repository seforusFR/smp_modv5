package net.mcreator.smpmodv.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.smpmodv.entity.LushgoblinEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class LushgoblinOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double random_animations = 0;
		double jeweler = 0;
		random_animations = Math.random() * 5;
		jeweler = Math.random() * 3;
		if ((entity.getDisplayName().getString()).equals("farmer")) {
			if (entity instanceof LushgoblinEntity animatable)
				animatable.setTexture("goblin_farmer");
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.FARMLAND) {
				if (entity instanceof LushgoblinEntity) {
					((LushgoblinEntity) entity).setAnimation("farming");
				}
			}
		} else if ((entity.getDisplayName().getString()).equals("armorer")) {
			if (entity instanceof LushgoblinEntity animatable)
				animatable.setTexture("goblin_smither");
			if (random_animations == 3) {
				if (entity instanceof LushgoblinEntity) {
					((LushgoblinEntity) entity).setAnimation("forging_armor");
				}
			}
		} else if ((entity.getDisplayName().getString()).equals("guard")) {
			if (entity instanceof LushgoblinEntity animatable)
				animatable.setTexture("goblin_guard");
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Player) {
						if (entity instanceof LushgoblinEntity) {
							((LushgoblinEntity) entity).setAnimation("guard_defend");
						}
						entity.getPersistentData().putBoolean("defending?", (true));
					} else {
						entity.getPersistentData().putBoolean("defending?", (false));
					}
				}
			}
		} else if ((entity.getDisplayName().getString()).equals("barman")) {
			if (entity instanceof LushgoblinEntity animatable)
				animatable.setTexture("goblin_barman");
		} else if ((entity.getDisplayName().getString()).equals("traveler")) {
			if (entity instanceof LushgoblinEntity animatable)
				animatable.setTexture("goblin_traveler");
			if ((world.getBlockState(new BlockPos(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z))).getBlock() == Blocks.CAVE_VINES_PLANT) {
				if (entity instanceof LushgoblinEntity) {
					((LushgoblinEntity) entity).setAnimation("traveler_cutting_vines");
				}
				world.setBlock(new BlockPos(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z), Blocks.AIR.defaultBlockState(), 3);
				world.levelEvent(2001, new BlockPos(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z), Block.getId(Blocks.CAVE_VINES_PLANT.defaultBlockState()));
			}
		} else if ((entity.getDisplayName().getString()).equals("jeweler")) {
			if (entity instanceof LushgoblinEntity animatable)
				animatable.setTexture("goblin_jeweler");
			if (jeweler == 1) {
				if (entity instanceof LushgoblinEntity) {
					((LushgoblinEntity) entity).setAnimation("jeweler_looking at stone_no");
				}
			} else if (jeweler == 3) {
				if (entity instanceof LushgoblinEntity) {
					((LushgoblinEntity) entity).setAnimation("jeweler_looking at stone_yes");
				}
			}
		} else if ((entity.getDisplayName().getString()).equals("brewer")) {
			if (entity instanceof LushgoblinEntity animatable)
				animatable.setTexture("goblin_bbrewer");
		} else if ((entity.getDisplayName().getString()).equals("weaponsmith")) {
			if (entity instanceof LushgoblinEntity animatable)
				animatable.setTexture("goblin_weapon_smith");
			if (random_animations == 3) {
				if (entity instanceof LushgoblinEntity) {
					((LushgoblinEntity) entity).setAnimation("forging_armor");
				}
			}
		}
	}
}
