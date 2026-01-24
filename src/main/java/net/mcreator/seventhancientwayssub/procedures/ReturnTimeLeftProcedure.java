package net.mcreator.seventhancientwayssub.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.seventhancientwayssub.init.PoisonMadnessModMobEffects;

public class ReturnTimeLeftProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(PoisonMadnessModMobEffects.NEUROTOXIN.get()) ? _livEnt.getEffect(PoisonMadnessModMobEffects.NEUROTOXIN.get()).getDuration() : 0) / 20) + "s";
	}
}
