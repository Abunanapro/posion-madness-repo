package net.mcreator.seventhancientwayssub.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.seventhancientwayssub.network.PoisonMadnessModVariables;

public class NumbnessEffectExpiresProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("poison_madness:backlash")))),
				(float) (entity.getCapability(PoisonMadnessModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PoisonMadnessModVariables.PlayerVariables())).DamageStackerNumbness);
	}
}
