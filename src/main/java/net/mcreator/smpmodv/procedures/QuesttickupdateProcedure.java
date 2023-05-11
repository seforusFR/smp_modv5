package net.mcreator.smpmodv.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.smpmodv.entity.LushgoblinEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class QuesttickupdateProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LushgoblinEntity) {
			if (entity.getPersistentData().getBoolean("quest1") == true) {
				if (entity instanceof LushgoblinEntity) {
					((LushgoblinEntity) entity).setAnimation("goblin_waving_when_quest");
				}
			}
			if (entity.getPersistentData().getBoolean("quest2") == true) {
				if (entity instanceof LushgoblinEntity) {
					((LushgoblinEntity) entity).setAnimation("goblin_waving_when_quest");
				}
			}
			if (entity.getPersistentData().getBoolean("quest3") == true) {
				if (entity instanceof LushgoblinEntity) {
					((LushgoblinEntity) entity).setAnimation("goblin_waving_when_quest");
				}
			}
			if (entity.getPersistentData().getBoolean("quest4b") == true) {
				if (entity instanceof LushgoblinEntity) {
					((LushgoblinEntity) entity).setAnimation("goblin_waving_when_quest");
				}
			}
		}
	}
}
