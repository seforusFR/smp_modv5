package net.mcreator.smpmodv.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.smpmodv.block.entity.SnaildensignTileEntity;

public class SnaildensignBlockModel extends AnimatedGeoModel<SnaildensignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SnaildensignTileEntity animatable) {
		return new ResourceLocation("smp_mod_v", "animations/sign_snail.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SnaildensignTileEntity animatable) {
		return new ResourceLocation("smp_mod_v", "geo/sign_snail.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SnaildensignTileEntity entity) {
		return new ResourceLocation("smp_mod_v", "textures/blocks/sign_snail.png");
	}
}
