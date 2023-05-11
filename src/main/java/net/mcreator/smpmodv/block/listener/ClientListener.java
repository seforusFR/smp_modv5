package net.mcreator.smpmodv.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.smpmodv.init.SmpModVModBlockEntities;
import net.mcreator.smpmodv.block.renderer.SqueezerTileRenderer;
import net.mcreator.smpmodv.block.renderer.SnaildensignTileRenderer;
import net.mcreator.smpmodv.block.renderer.AlchemytableTileRenderer;
import net.mcreator.smpmodv.SmpModVMod;

@Mod.EventBusSubscriber(modid = SmpModVMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(SmpModVModBlockEntities.ALCHEMYTABLE.get(), AlchemytableTileRenderer::new);
		event.registerBlockEntityRenderer(SmpModVModBlockEntities.SQUEEZER.get(), SqueezerTileRenderer::new);
		event.registerBlockEntityRenderer(SmpModVModBlockEntities.SNAILDENSIGN.get(), SnaildensignTileRenderer::new);
	}
}
