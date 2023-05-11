package net.mcreator.smpmodv.procedures;

import net.minecraft.world.entity.Entity;

public class Followplayerquest4Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("follow4") == true) {
			return true;
		}
		return false;
	}
}
