
package net.mcreator.seventhancientwayssub.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.seventhancientwayssub.procedures.ToxinOnEffectActiveTickProcedure;
import net.mcreator.seventhancientwayssub.procedures.ToxinEffectExpiresProcedure;

public class ToxinMobEffect extends MobEffect {
	public ToxinMobEffect() {
		super(MobEffectCategory.HARMFUL, -16621568);
	}

	@Override
	public String getDescriptionId() {
		return "effect.poison_madness.toxin";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ToxinOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		ToxinEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
