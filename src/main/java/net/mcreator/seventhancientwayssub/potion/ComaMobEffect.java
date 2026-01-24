
package net.mcreator.seventhancientwayssub.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.seventhancientwayssub.procedures.ComaOnEffectActiveTickProcedure;

public class ComaMobEffect extends MobEffect {
	public ComaMobEffect() {
		super(MobEffectCategory.HARMFUL, -14729030);
	}

	@Override
	public String getDescriptionId() {
		return "effect.poison_madness.coma";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ComaOnEffectActiveTickProcedure.execute(entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
