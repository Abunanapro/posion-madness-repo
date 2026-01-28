package net.mcreator.seventhancientwayssub.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.seventhancientwayssub.init.PoisonMadnessModMobEffects;

public class BlackoutOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(
					new MobEffectInstance(MobEffects.BLINDNESS, entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(PoisonMadnessModMobEffects.BLACKOUT.get()) ? _livEnt.getEffect(PoisonMadnessModMobEffects.BLACKOUT.get()).getDuration() : 0,
							entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(PoisonMadnessModMobEffects.BLACKOUT.get()) ? _livEnt.getEffect(PoisonMadnessModMobEffects.BLACKOUT.get()).getAmplifier() : 0));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN,
					entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(PoisonMadnessModMobEffects.BLACKOUT.get()) ? _livEnt.getEffect(PoisonMadnessModMobEffects.BLACKOUT.get()).getDuration() : 0,
					entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(PoisonMadnessModMobEffects.BLACKOUT.get()) ? _livEnt.getEffect(PoisonMadnessModMobEffects.BLACKOUT.get()).getAmplifier() : 0));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,
					entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(PoisonMadnessModMobEffects.BLACKOUT.get()) ? _livEnt.getEffect(PoisonMadnessModMobEffects.BLACKOUT.get()).getDuration() : 0,
					entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(PoisonMadnessModMobEffects.BLACKOUT.get()) ? _livEnt.getEffect(PoisonMadnessModMobEffects.BLACKOUT.get()).getAmplifier() : 0));
	}
}
