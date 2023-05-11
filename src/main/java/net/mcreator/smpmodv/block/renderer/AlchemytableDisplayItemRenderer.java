package net.mcreator.smpmodv.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.smpmodv.block.model.AlchemytableDisplayModel;
import net.mcreator.smpmodv.block.display.AlchemytableDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AlchemytableDisplayItemRenderer extends GeoItemRenderer<AlchemytableDisplayItem> {
	public AlchemytableDisplayItemRenderer() {
		super(new AlchemytableDisplayModel());
	}

	@Override
	public RenderType getRenderType(AlchemytableDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
