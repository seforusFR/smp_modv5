
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.smpmodv.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.smpmodv.potion.CrabmastereffectMobEffect;
import net.mcreator.smpmodv.SmpModVMod;

public class SmpModVModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, SmpModVMod.MODID);
	public static final RegistryObject<MobEffect> CRABMASTEREFFECT = REGISTRY.register("crabmastereffect", () -> new CrabmastereffectMobEffect());
}
