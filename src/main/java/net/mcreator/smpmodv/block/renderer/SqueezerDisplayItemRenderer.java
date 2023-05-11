package net.mcreator.smpmodv.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.smpmodv.block.model.SqueezerDisplayModel;
import net.mcreator.smpmodv.block.display.SqueezerDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SqueezerDisplayItemRenderer extends GeoItemRenderer<SqueezerDisplayItem> {
	public SqueezerDisplayItemRenderer() {
		super(new SqueezerDisplayModel());
	}

	@Override
	public RenderType getRenderType(SqueezerDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
