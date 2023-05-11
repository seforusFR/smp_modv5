
package net.mcreator.smpmodv.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.smpmodv.procedures.CrabmastereffectEffectStartedappliedProcedure;

public class CrabmastereffectMobEffect extends MobEffect {
	public CrabmastereffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -2857980);
	}

	@Override
	public String getDescriptionId() {
		return "effect.smp_mod_v.crabmastereffect";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		CrabmastereffectEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
