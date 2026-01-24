package net.mcreator.seventhancientwayssub.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.seventhancientwayssub.init.PoisonMadnessModMobEffects;

public class PoisonFrogBlueEntityIsHurtProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.COMA.get(), 100, 1, false, true));
	}
}
