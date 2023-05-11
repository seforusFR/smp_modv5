
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.smpmodv.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.smpmodv.client.gui.SqueezerGUIScreen;
import net.mcreator.smpmodv.client.gui.AlchemytableguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SmpModVModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(SmpModVModMenus.SQUEEZER_GUI.get(), SqueezerGUIScreen::new);
			MenuScreens.register(SmpModVModMenus.ALCHEMYTABLEGUI.get(), AlchemytableguiScreen::new);
		});
	}
}
