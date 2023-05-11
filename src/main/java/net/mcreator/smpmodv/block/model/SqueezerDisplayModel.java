package net.mcreator.smpmodv.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.smpmodv.block.display.SqueezerDisplayItem;

public class SqueezerDisplayModel extends AnimatedGeoModel<SqueezerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SqueezerDisplayItem animatable) {
		return new ResourceLocation("smp_mod_v", "animations/fruit_squeezer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SqueezerDisplayItem animatable) {
		return new ResourceLocation("smp_mod_v", "geo/fruit_squeezer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SqueezerDisplayItem entity) {
		return new ResourceLocation("smp_mod_v", "textures/blocks/fruit_squeezer.png");
	}
}
