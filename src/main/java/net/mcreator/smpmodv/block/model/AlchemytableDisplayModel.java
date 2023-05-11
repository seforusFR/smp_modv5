package net.mcreator.smpmodv.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.smpmodv.block.display.AlchemytableDisplayItem;

public class AlchemytableDisplayModel extends AnimatedGeoModel<AlchemytableDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AlchemytableDisplayItem animatable) {
		return new ResourceLocation("smp_mod_v", "animations/alchemy_table.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AlchemytableDisplayItem animatable) {
		return new ResourceLocation("smp_mod_v", "geo/alchemy_table.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AlchemytableDisplayItem entity) {
		return new ResourceLocation("smp_mod_v", "textures/blocks/alchemy_table.png");
	}
}
