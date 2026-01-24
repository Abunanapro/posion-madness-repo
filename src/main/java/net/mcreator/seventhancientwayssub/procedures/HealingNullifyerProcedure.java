package net.mcreator.seventhancientwayssub.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHealEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.seventhancientwayssub.init.PoisonMadnessModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HealingNullifyerProcedure {
	@SubscribeEvent
	public static void onEntityHealed(LivingHealEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(PoisonMadnessModMobEffects.NUMBNESS.get()) && entity instanceof Player && entity instanceof ServerPlayer) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
	}
}
