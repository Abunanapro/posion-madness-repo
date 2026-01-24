
package net.mcreator.seventhancientwayssub.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.seventhancientwayssub.procedures.TorporOnEffectActiveTickProcedure;

public class TorporMobEffect extends MobEffect {
	public TorporMobEffect() {
		super(MobEffectCategory.HARMFUL, -6749953);
	}

	@Override
	public String getDescriptionId() {
		return "effect.poison_madness.torpor";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		TorporOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
