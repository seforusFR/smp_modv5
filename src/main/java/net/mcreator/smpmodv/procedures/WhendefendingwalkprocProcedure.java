package net.mcreator.smpmodv.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.smpmodv.entity.LushgoblinEntity;

public class WhendefendingwalkprocProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LushgoblinEntity) {
			if (entity.getPersistentData().getBoolean("defending?") == true) {
				return true;
			}
		}
		return false;
	}
}
