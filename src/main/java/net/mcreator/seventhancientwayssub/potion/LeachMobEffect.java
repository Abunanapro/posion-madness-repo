
package net.mcreator.seventhancientwayssub.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.seventhancientwayssub.procedures.LeachOnEffectActiveTickProcedure;

public class LeachMobEffect extends MobEffect {
	public LeachMobEffect() {
		super(MobEffectCategory.NEUTRAL, -12845056);
	}

	@Override
	public String getDescriptionId() {
		return "effect.poison_madness.leach";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		LeachOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
