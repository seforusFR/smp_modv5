package net.mcreator.smpmodv.entity.model;

import software.bernie.geckolib3.model.provider.data.EntityModelData;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.smpmodv.entity.LushgoblinEntity;

public class LushgoblinModel extends AnimatedGeoModel<LushgoblinEntity> {
	@Override
	public ResourceLocation getAnimationResource(LushgoblinEntity entity) {
		return new ResourceLocation("smp_mod_v", "animations/lush_goblin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LushgoblinEntity entity) {
		return new ResourceLocation("smp_mod_v", "geo/lush_goblin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LushgoblinEntity entity) {
		return new ResourceLocation("smp_mod_v", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(LushgoblinEntity animatable, int instanceId, AnimationEvent animationEvent) {
		super.setCustomAnimations(animatable, instanceId, animationEvent);
		IBone head = this.getAnimationProcessor().getBone("head");
		EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
		AnimationData manager = animatable.getFactory().getOrCreateAnimationData(instanceId);
		int unpausedMultiplier = !Minecraft.getInstance().isPaused() || manager.shouldPlayWhilePaused ? 1 : 0;
		head.setRotationX(head.getRotationX() + extraData.headPitch * ((float) Math.PI / 180F) * unpausedMultiplier);
		head.setRotationY(head.getRotationY() + extraData.netHeadYaw * ((float) Math.PI / 180F) * unpausedMultiplier);
	}
}
