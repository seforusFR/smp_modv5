
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.smpmodv.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.smpmodv.entity.LushhermitcrabEntity;
import net.mcreator.smpmodv.entity.LushgoblinEntity;
import net.mcreator.smpmodv.entity.BlssomcreatureEntity;
import net.mcreator.smpmodv.SmpModVMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SmpModVModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SmpModVMod.MODID);
	public static final RegistryObject<EntityType<LushhermitcrabEntity>> LUSHHERMITCRAB = register("lushhermitcrab",
			EntityType.Builder.<LushhermitcrabEntity>of(LushhermitcrabEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LushhermitcrabEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<BlssomcreatureEntity>> BLSSOMCREATURE = register("blssomcreature",
			EntityType.Builder.<BlssomcreatureEntity>of(BlssomcreatureEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlssomcreatureEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LushgoblinEntity>> LUSHGOBLIN = register("lushgoblin",
			EntityType.Builder.<LushgoblinEntity>of(LushgoblinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(120).setUpdateInterval(3).setCustomClientFactory(LushgoblinEntity::new)

					.sized(1f, 1f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			LushhermitcrabEntity.init();
			BlssomcreatureEntity.init();
			LushgoblinEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(LUSHHERMITCRAB.get(), LushhermitcrabEntity.createAttributes().build());
		event.put(BLSSOMCREATURE.get(), BlssomcreatureEntity.createAttributes().build());
		event.put(LUSHGOBLIN.get(), LushgoblinEntity.createAttributes().build());
	}
}
