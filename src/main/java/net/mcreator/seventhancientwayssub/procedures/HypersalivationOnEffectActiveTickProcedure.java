package net.mcreator.seventhancientwayssub.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class HypersalivationOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player || entity instanceof Player) {
			if (entity instanceof Player _player)
				_player.causeFoodExhaustion(1);
			if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) <= 0) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("poison_madness:extreme_salivation")))), 1);
			}
		}
	}
}
