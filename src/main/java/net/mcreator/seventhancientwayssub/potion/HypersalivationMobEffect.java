
package net.mcreator.seventhancientwayssub.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.seventhancientwayssub.procedures.HypersalivationOnEffectActiveTickProcedure;

public class HypersalivationMobEffect extends MobEffect {
	public HypersalivationMobEffect() {
		super(MobEffectCategory.NEUTRAL, -15002009);
	}

	@Override
	public String getDescriptionId() {
		return "effect.poison_madness.hypersalivation";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		HypersalivationOnEffectActiveTickProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
