
package net.mcreator.seventhancientwayssub.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.seventhancientwayssub.procedures.NeurotoxinOnEffectActiveTickProcedure;
import net.mcreator.seventhancientwayssub.procedures.NeurotoxinEffectStartedappliedProcedure;
import net.mcreator.seventhancientwayssub.procedures.NeurotoxinEffectExpiresProcedure;

public class NeurotoxinMobEffect extends MobEffect {
	public NeurotoxinMobEffect() {
		super(MobEffectCategory.HARMFUL, -9810688);
	}

	@Override
	public String getDescriptionId() {
		return "effect.poison_madness.neurotoxin";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		NeurotoxinEffectStartedappliedProcedure.execute();
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		NeurotoxinOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		NeurotoxinEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
