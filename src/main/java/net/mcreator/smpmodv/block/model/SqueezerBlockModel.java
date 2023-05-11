package net.mcreator.smpmodv.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.smpmodv.block.entity.SqueezerTileEntity;

public class SqueezerBlockModel extends AnimatedGeoModel<SqueezerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SqueezerTileEntity animatable) {
		return new ResourceLocation("smp_mod_v", "animations/fruit_squeezer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SqueezerTileEntity animatable) {
		return new ResourceLocation("smp_mod_v", "geo/fruit_squeezer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SqueezerTileEntity entity) {
		return new ResourceLocation("smp_mod_v", "textures/blocks/fruit_squeezer.png");
	}
}
