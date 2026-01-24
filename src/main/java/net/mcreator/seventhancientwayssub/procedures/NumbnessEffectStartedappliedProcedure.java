package net.mcreator.seventhancientwayssub.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.seventhancientwayssub.network.PoisonMadnessModVariables;

public class NumbnessEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1;
			entity.getCapability(PoisonMadnessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.LastHealthNumbness = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1;
			entity.getCapability(PoisonMadnessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.LastTickHealth = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
