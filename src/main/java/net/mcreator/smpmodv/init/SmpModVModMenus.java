
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.smpmodv.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.smpmodv.world.inventory.SqueezerGUIMenu;
import net.mcreator.smpmodv.world.inventory.AlchemytableguiMenu;
import net.mcreator.smpmodv.SmpModVMod;

public class SmpModVModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, SmpModVMod.MODID);
	public static final RegistryObject<MenuType<SqueezerGUIMenu>> SQUEEZER_GUI = REGISTRY.register("squeezer_gui", () -> IForgeMenuType.create(SqueezerGUIMenu::new));
	public static final RegistryObject<MenuType<AlchemytableguiMenu>> ALCHEMYTABLEGUI = REGISTRY.register("alchemytablegui", () -> IForgeMenuType.create(AlchemytableguiMenu::new));
}
