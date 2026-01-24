
package net.mcreator.seventhancientwayssub.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.seventhancientwayssub.procedures.NumbnessEffectStartedappliedProcedure;
import net.mcreator.seventhancientwayssub.procedures.NumbnessEffectExpiresProcedure;

public class NumbnessMobEffect extends MobEffect {
	public NumbnessMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16724992);
	}

	@Override
	public String getDescriptionId() {
		return "effect.poison_madness.numbness";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		NumbnessEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		NumbnessEffectExpiresProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
