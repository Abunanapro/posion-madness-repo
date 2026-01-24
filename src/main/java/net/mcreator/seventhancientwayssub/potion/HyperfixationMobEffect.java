
package net.mcreator.seventhancientwayssub.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.seventhancientwayssub.procedures.HyperfixationOnEffectActiveTickProcedure;

public class HyperfixationMobEffect extends MobEffect {
	public HyperfixationMobEffect() {
		super(MobEffectCategory.HARMFUL, -16777216);
	}

	@Override
	public String getDescriptionId() {
		return "effect.poison_madness.hyperfixation";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		HyperfixationOnEffectActiveTickProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
