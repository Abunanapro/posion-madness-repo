
package net.mcreator.seventhancientwayssub.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.seventhancientwayssub.procedures.StimulationOnEffectActiveTickProcedure;
import net.mcreator.seventhancientwayssub.procedures.StimulationEffectStartedappliedProcedure;

public class StimulationMobEffect extends MobEffect {
	public StimulationMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3407872);
	}

	@Override
	public String getDescriptionId() {
		return "effect.poison_madness.stimulation";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		StimulationEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		StimulationOnEffectActiveTickProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
