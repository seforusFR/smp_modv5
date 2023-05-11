package net.mcreator.smpmodv.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.smpmodv.block.display.SnaildensignDisplayItem;

public class SnaildensignDisplayModel extends AnimatedGeoModel<SnaildensignDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SnaildensignDisplayItem animatable) {
		return new ResourceLocation("smp_mod_v", "animations/sign_snail.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SnaildensignDisplayItem animatable) {
		return new ResourceLocation("smp_mod_v", "geo/sign_snail.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SnaildensignDisplayItem entity) {
		return new ResourceLocation("smp_mod_v", "textures/blocks/sign_snail.png");
	}
}
