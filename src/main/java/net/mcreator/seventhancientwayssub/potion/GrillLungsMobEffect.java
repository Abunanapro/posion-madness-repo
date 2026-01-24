
package net.mcreator.seventhancientwayssub.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.seventhancientwayssub.procedures.GrillLungsOnEffectActiveTickProcedure;

public class GrillLungsMobEffect extends MobEffect {
	public GrillLungsMobEffect() {
		super(MobEffectCategory.HARMFUL, -16755041);
	}

	@Override
	public String getDescriptionId() {
		return "effect.poison_madness.grill_lungs";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		GrillLungsOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
