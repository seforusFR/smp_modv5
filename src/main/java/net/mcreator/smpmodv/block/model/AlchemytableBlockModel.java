package net.mcreator.smpmodv.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.smpmodv.block.entity.AlchemytableTileEntity;

public class AlchemytableBlockModel extends AnimatedGeoModel<AlchemytableTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AlchemytableTileEntity animatable) {
		return new ResourceLocation("smp_mod_v", "animations/alchemy_table.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AlchemytableTileEntity animatable) {
		return new ResourceLocation("smp_mod_v", "geo/alchemy_table.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AlchemytableTileEntity entity) {
		return new ResourceLocation("smp_mod_v", "textures/blocks/alchemy_table.png");
	}
}
