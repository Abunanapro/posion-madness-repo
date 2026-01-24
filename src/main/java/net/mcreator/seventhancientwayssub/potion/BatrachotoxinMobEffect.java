
package net.mcreator.seventhancientwayssub.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.seventhancientwayssub.procedures.BatrachotoxinOnEffectActiveTickProcedure;

public class BatrachotoxinMobEffect extends MobEffect {
	public BatrachotoxinMobEffect() {
		super(MobEffectCategory.HARMFUL, -3355648);
	}

	@Override
	public String getDescriptionId() {
		return "effect.poison_madness.batrachotoxin";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BatrachotoxinOnEffectActiveTickProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
