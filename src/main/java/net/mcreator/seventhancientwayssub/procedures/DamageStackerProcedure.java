package net.mcreator.seventhancientwayssub.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.seventhancientwayssub.network.PoisonMadnessModVariables;
import net.mcreator.seventhancientwayssub.init.PoisonMadnessModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DamageStackerProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getAmount());
		}
	}

	public static void execute(Entity entity, double amount) {
		execute(null, entity, amount);
	}

	private static void execute(@Nullable Event event, Entity entity, double amount) {
		if (entity == null)
			return;
		double newDamage = 0;
		double oldDamage = 0;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(PoisonMadnessModMobEffects.NUMBNESS.get())) {
			{
				double _setval = (entity.getCapability(PoisonMadnessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PoisonMadnessModVariables.PlayerVariables())).DamageStackerNumbness + amount;
				entity.getCapability(PoisonMadnessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.DamageStackerNumbness = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			oldDamage = amount;
			newDamage = amount - amount;
			((LivingHurtEvent) event).setAmount((float) newDamage);
		}
	}
}
