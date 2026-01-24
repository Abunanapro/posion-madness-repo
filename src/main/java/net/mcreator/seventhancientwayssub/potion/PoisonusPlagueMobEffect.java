
package net.mcreator.seventhancientwayssub.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.seventhancientwayssub.procedures.PoisonusPlagueOnEffectActiveTickProcedure;

public class PoisonusPlagueMobEffect extends MobEffect {
	public PoisonusPlagueMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10092340);
	}

	@Override
	public String getDescriptionId() {
		return "effect.poison_madness.poisonus_plague";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PoisonusPlagueOnEffectActiveTickProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
