package net.mcreator.smpmodv.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.smpmodv.entity.LushhermitcrabEntity;

public class LushhermitcrabOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		random = Math.random() * 10;
		if (random <= 3) {
			if (entity instanceof LushhermitcrabEntity animatable)
				animatable.setTexture("tan_hermit_rab");
			entity.getPersistentData().putString("tan", "1");
		} else if (random <= 7) {
			if (entity instanceof LushhermitcrabEntity animatable)
				animatable.setTexture("grey_hermit_crab");
			entity.getPersistentData().putString("grey", "1");
		} else if (random <= 4) {
			if (entity instanceof LushhermitcrabEntity animatable)
				animatable.setTexture("blue_hermit_crabs");
			entity.getPersistentData().putString("blue", "1");
		} else if (random <= 6) {
			if (entity instanceof LushhermitcrabEntity animatable)
				animatable.setTexture("hermit_crab_orange");
			entity.getPersistentData().putString("orange", "1");
		}
	}
}
