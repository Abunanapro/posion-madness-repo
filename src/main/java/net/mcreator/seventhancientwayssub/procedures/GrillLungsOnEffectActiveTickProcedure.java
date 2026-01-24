package net.mcreator.seventhancientwayssub.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.seventhancientwayssub.init.PoisonMadnessModMobEffects;

public class GrillLungsOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isUnderWater()) {
			entity.setAirSupply((int) (entity.getAirSupply() + 2));
		} else {
			entity.setAirSupply((int) (entity.getAirSupply()
					- (5 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(PoisonMadnessModMobEffects.GRILL_LUNGS.get()) ? _livEnt.getEffect(PoisonMadnessModMobEffects.GRILL_LUNGS.get()).getAmplifier() : 0))));
		}
	}
}
