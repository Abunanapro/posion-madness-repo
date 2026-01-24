package net.mcreator.seventhancientwayssub.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.seventhancientwayssub.network.PoisonMadnessModVariables;

public class StimulationOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) != (entity.getCapability(PoisonMadnessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PoisonMadnessModVariables.PlayerVariables())).LastTickHunger) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("poison_madness:stimulation_damage")))),
					(float) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0)
							- (entity.getCapability(PoisonMadnessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PoisonMadnessModVariables.PlayerVariables())).LastTickHunger));
		}
		{
			double _setval = entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0;
			entity.getCapability(PoisonMadnessModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.LastTickHunger = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof Player _player)
			_player.getFoodData().setFoodLevel((int) (entity.getCapability(PoisonMadnessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PoisonMadnessModVariables.PlayerVariables())).LastHungerStimulation);
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10, 2, false, false));
	}
}
