
package net.mcreator.seventhancientwayssub.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.seventhancientwayssub.procedures.BlackoutOnEffectActiveTickProcedure;

public class BlackoutMobEffect extends MobEffect {
	public BlackoutMobEffect() {
		super(MobEffectCategory.HARMFUL, -16777216);
	}

	@Override
	public String getDescriptionId() {
		return "effect.poison_madness.blackout";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BlackoutOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
