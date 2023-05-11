package net.mcreator.smpmodv.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.smpmodv.entity.LushgoblinEntity;

public class AttackgoblinProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getDisplayName().getString()).equals("guard")) {
			if (entity instanceof LushgoblinEntity) {
				((LushgoblinEntity) entity).setAnimation("guard attack");
			}
			return true;
		}
		return false;
	}
}
