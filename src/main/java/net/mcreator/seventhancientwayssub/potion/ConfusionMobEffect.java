
package net.mcreator.seventhancientwayssub.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.seventhancientwayssub.procedures.ConfusionOnEffectActiveTickProcedure;

public class ConfusionMobEffect extends MobEffect {
	public ConfusionMobEffect() {
		super(MobEffectCategory.HARMFUL, -2096897);
	}

	@Override
	public String getDescriptionId() {
		return "effect.poison_madness.confusion";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ConfusionOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
