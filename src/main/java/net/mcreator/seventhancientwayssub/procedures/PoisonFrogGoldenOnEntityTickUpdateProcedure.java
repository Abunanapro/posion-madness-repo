package net.mcreator.seventhancientwayssub.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.seventhancientwayssub.entity.PoisonFrogYellowEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogVioletEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogRedWhiteEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogRedEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogPinkEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogOrangeEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogGreenEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogGoldenEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogDarkPurpleEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogDarkEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogCyanEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogCrimsonEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogCommonEntity;
import net.mcreator.seventhancientwayssub.entity.PoisonFrogBlueEntity;

public class PoisonFrogGoldenOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String poison = "";
		if (Mth.nextInt(RandomSource.create(), 1, 200) == 67 && entity.onGround()) {
			{
				Entity _ent = entity;
				_ent.setYRot(Mth.nextInt(RandomSource.create(), 1, 360));
				_ent.setXRot(entity.getXRot());
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
			entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 1.3), 0.5, (entity.getLookAngle().z * 1.3)));
		}
		if (entity.isInWater()) {
			entity.fallDistance = 0;
			if (Mth.nextInt(RandomSource.create(), 1, 100) == 67) {
				entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 0.2), 0.1, (entity.getLookAngle().z * 0.2)));
			}
		}
		if (entity.onGround() && true == entity.getPersistentData().getBoolean("launched")) {
			entity.getPersistentData().putBoolean("launched", false);
			if (entity instanceof PoisonFrogGoldenEntity) {
				poison = "batrachotoxin";
			} else if (entity instanceof PoisonFrogBlueEntity) {
				poison = "coma";
			} else if (entity instanceof PoisonFrogCommonEntity) {
				poison = "toxin";
			} else if (entity instanceof PoisonFrogCrimsonEntity) {
				poison = "torpor";
			} else if (entity instanceof PoisonFrogCyanEntity) {
				poison = "thermogenesis";
			} else if (entity instanceof PoisonFrogDarkEntity) {
				poison = "leach";
			} else if (entity instanceof PoisonFrogPinkEntity) {
				poison = "confusion";
			} else if (entity instanceof PoisonFrogDarkPurpleEntity) {
				poison = "neurotoxin";
			} else if (entity instanceof PoisonFrogGreenEntity) {
				poison = "numbness";
			} else if (entity instanceof PoisonFrogOrangeEntity) {
				poison = "vulnerability";
			} else if (entity instanceof PoisonFrogRedEntity) {
				poison = "stimulation";
			} else if (entity instanceof PoisonFrogRedWhiteEntity) {
				poison = "vanish";
			} else if (entity instanceof PoisonFrogVioletEntity) {
				poison = "hypersalivation";
			} else if (entity instanceof PoisonFrogYellowEntity) {
				poison = "reanimation_toxin";
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), ("/effect give @e[distance=..3] poison_madness:" + poison + " 7 0 false"));
				}
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"/summon area_effect_cloud ~ ~ ~ {Particle:cloud,Radius:2,Duration:10}");
		}
	}
}
