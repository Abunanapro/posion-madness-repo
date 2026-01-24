
package net.mcreator.seventhancientwayssub.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.seventhancientwayssub.procedures.ThermogenesisOnEffectActiveTickProcedure;

public class ThermogenesisMobEffect extends MobEffect {
	public ThermogenesisMobEffect() {
		super(MobEffectCategory.HARMFUL, -16711707);
	}

	@Override
	public String getDescriptionId() {
		return "effect.poison_madness.thermogenesis";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ThermogenesisOnEffectActiveTickProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
