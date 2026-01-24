package net.mcreator.seventhancientwayssub.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.seventhancientwayssub.init.PoisonMadnessModMobEffects;

public class DartProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity.getPersistentData().getBoolean("batrachotoxin") == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.BATRACHOTOXIN.get(), 200, 0));
		}
		if (sourceentity.getPersistentData().getBoolean("coma") == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.COMA.get(), 200, 0));
		}
		if (sourceentity.getPersistentData().getBoolean("vulnerability") == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.VULNERABILITY.get(), 200, 0));
		}
		if (sourceentity.getPersistentData().getBoolean("torpor") == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.TORPOR.get(), 200, 0));
		}
		if (sourceentity.getPersistentData().getBoolean("stimulation") == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.STIMULATION.get(), 200, 0));
		}
		if (sourceentity.getPersistentData().getBoolean("numbness") == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.NUMBNESS.get(), 200, 0));
		}
		if (sourceentity.getPersistentData().getBoolean("confusion") == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.CONFUSION.get(), 200, 0));
		}
		if (sourceentity.getPersistentData().getBoolean("hypersalivation") == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.HYPERSALIVATION.get(), 200, 0));
		}
		if (sourceentity.getPersistentData().getBoolean("leach") == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.LEACH.get(), 200, 0));
		}
		if (sourceentity.getPersistentData().getBoolean("thermogenesis") == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.THERMOGENESIS.get(), 200, 0));
		}
		if (sourceentity.getPersistentData().getBoolean("toxin") == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.TOXIN.get(), 200, 0));
		}
		if (sourceentity.getPersistentData().getBoolean("worm") == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.NEUROTOXIN.get(), 200, 0));
		}
		if (sourceentity.getPersistentData().getBoolean("reanimation") == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.REANIMATING_TOXIN.get(), 200, 0));
		}
		if (sourceentity.getPersistentData().getBoolean("Poisonus Plague") == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.POISONUS_PLAGUE.get(), 200, 0));
		}
		if (sourceentity.getPersistentData().getBoolean("Grill Lungs") == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.GRILL_LUNGS.get(), 200, 0));
		}
		if (sourceentity.getPersistentData().getBoolean("hyperfixation") == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.HYPERFIXATION.get(), 200, 0));
		}
		if (sourceentity.getPersistentData().getBoolean("vanish") == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.VANISH.get(), 200, 0));
		}
	}
}
