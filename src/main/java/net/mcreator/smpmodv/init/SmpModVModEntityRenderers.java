
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.smpmodv.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.smpmodv.client.renderer.LushhermitcrabRenderer;
import net.mcreator.smpmodv.client.renderer.LushgoblinRenderer;
import net.mcreator.smpmodv.client.renderer.BlssomcreatureRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SmpModVModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SmpModVModEntities.LUSHHERMITCRAB.get(), LushhermitcrabRenderer::new);
		event.registerEntityRenderer(SmpModVModEntities.BLSSOMCREATURE.get(), BlssomcreatureRenderer::new);
		event.registerEntityRenderer(SmpModVModEntities.LUSHGOBLIN.get(), LushgoblinRenderer::new);
	}
}
