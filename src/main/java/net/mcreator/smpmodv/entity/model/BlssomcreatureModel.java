package net.mcreator.smpmodv.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.smpmodv.entity.BlssomcreatureEntity;

public class BlssomcreatureModel extends AnimatedGeoModel<BlssomcreatureEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlssomcreatureEntity entity) {
		return new ResourceLocation("smp_mod_v", "animations/blossom_creature.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlssomcreatureEntity entity) {
		return new ResourceLocation("smp_mod_v", "geo/blossom_creature.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlssomcreatureEntity entity) {
		return new ResourceLocation("smp_mod_v", "textures/entities/" + entity.getTexture() + ".png");
	}

}
