
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.smpmodv.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.smpmodv.SmpModVMod;

public class SmpModVModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, SmpModVMod.MODID);
	public static final RegistryObject<Potion> CRABMASTER = REGISTRY.register("crabmaster", () -> new Potion(new MobEffectInstance(SmpModVModMobEffects.CRABMASTEREFFECT.get(), 3600, 0, false, true)));
}
