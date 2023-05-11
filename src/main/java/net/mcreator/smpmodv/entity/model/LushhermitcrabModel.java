package net.mcreator.smpmodv.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.smpmodv.entity.LushhermitcrabEntity;

public class LushhermitcrabModel extends AnimatedGeoModel<LushhermitcrabEntity> {
	@Override
	public ResourceLocation getAnimationResource(LushhermitcrabEntity entity) {
		return new ResourceLocation("smp_mod_v", "animations/hermit_crab.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LushhermitcrabEntity entity) {
		return new ResourceLocation("smp_mod_v", "geo/hermit_crab.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LushhermitcrabEntity entity) {
		return new ResourceLocation("smp_mod_v", "textures/entities/" + entity.getTexture() + ".png");
	}

}
