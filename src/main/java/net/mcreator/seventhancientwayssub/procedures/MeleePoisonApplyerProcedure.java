package net.mcreator.seventhancientwayssub.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.TridentItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.seventhancientwayssub.init.PoisonMadnessModMobEffects;
import net.mcreator.seventhancientwayssub.init.PoisonMadnessModEnchantments;
import net.mcreator.seventhancientwayssub.PoisonMadnessMod;

import javax.annotation.Nullable;

import java.util.Map;

@Mod.EventBusSubscriber
public class MeleePoisonApplyerProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		ItemStack sword = ItemStack.EMPTY;
		double GeneralDuration = 0;
		sword = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
		GeneralDuration = 70;
		if (sword.getOrCreateTag().getDouble("sworduses") > 0 && sword.getOrCreateTag().getBoolean("coated") == true && sword.getOrCreateTag().getBoolean("coated") == true && (sword.getItem() instanceof SwordItem
				|| sword.getItem() instanceof ShovelItem || sword.getItem() instanceof AxeItem || sword.getItem() instanceof TridentItem || sword.getItem() instanceof PickaxeItem || sword.getItem() instanceof HoeItem)) {
			sword.getOrCreateTag().putDouble("sworduses", (sword.getOrCreateTag().getDouble("sworduses") - 1));
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(sword);
				if (_enchantments.containsKey(PoisonMadnessModEnchantments.COATED.get())) {
					_enchantments.remove(PoisonMadnessModEnchantments.COATED.get());
					EnchantmentHelper.setEnchantments(_enchantments, sword);
				}
			}
			sword.enchant(PoisonMadnessModEnchantments.COATED.get(), (int) sword.getOrCreateTag().getDouble("sworduses"));
			if (sword.getOrCreateTag().getDouble("sworduses") == 0) {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(sword);
					if (_enchantments.containsKey(PoisonMadnessModEnchantments.COATED.get())) {
						_enchantments.remove(PoisonMadnessModEnchantments.COATED.get());
						EnchantmentHelper.setEnchantments(_enchantments, sword);
					}
				}
				sword.getOrCreateTag().putBoolean("coated", false);
				sword.getOrCreateTag().putDouble("coats", 0);
				sword.getOrCreateTag().putBoolean("batrachotoxin", false);
				sword.getOrCreateTag().putBoolean("coma", false);
				sword.getOrCreateTag().putBoolean("vulnerability", false);
				sword.getOrCreateTag().putBoolean("torpor", false);
				sword.getOrCreateTag().putBoolean("stimulation", false);
				sword.getOrCreateTag().putBoolean("numbness", false);
				sword.getOrCreateTag().putBoolean("confusion", false);
				sword.getOrCreateTag().putBoolean("hypersalivation", false);
				sword.getOrCreateTag().putBoolean("leach", false);
				sword.getOrCreateTag().putBoolean("thermogenesis", false);
				sword.getOrCreateTag().putBoolean("thermogenesis", false);
				sword.getOrCreateTag().putBoolean("toxin", false);
				sword.getOrCreateTag().putBoolean("worm", false);
				sword.getOrCreateTag().putBoolean("Poisonus Plague", false);
				sword.getOrCreateTag().putBoolean("reanimation", false);
				sword.getOrCreateTag().putBoolean("Grill Lungs", false);
				sword.getOrCreateTag().putBoolean("hyperfixation", false);
				sword.getOrCreateTag().putBoolean("vanish", false);
				sword.getOrCreateTag().putBoolean("combustion", false);
				sword.getOrCreateTag().putBoolean("overchargeleg", false);
				sword.getOrCreateTag().putBoolean("blackout", false);
			}
			if (sword.getOrCreateTag().getBoolean("batrachotoxin") == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.BATRACHOTOXIN.get(), (int) GeneralDuration, 0));
			}
			if (sword.getOrCreateTag().getBoolean("coma") == true) {
				PoisonMadnessMod.queueServerWork(2, () -> {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.COMA.get(), 70, 0));
				});
			}
			if (sword.getOrCreateTag().getBoolean("vulnerability") == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.VULNERABILITY.get(), (int) GeneralDuration, 0));
			}
			if (sword.getOrCreateTag().getBoolean("torpor") == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.TORPOR.get(), (int) GeneralDuration, 0));
			}
			if (sword.getOrCreateTag().getBoolean("stimulation") == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.STIMULATION.get(), (int) GeneralDuration, 0));
			}
			if (sword.getOrCreateTag().getBoolean("numbness") == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.NUMBNESS.get(), (int) GeneralDuration, 0));
			}
			if (sword.getOrCreateTag().getBoolean("confusion") == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.CONFUSION.get(), (int) GeneralDuration, 0));
			}
			if (sword.getOrCreateTag().getBoolean("hypersalivation") == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.HYPERSALIVATION.get(), (int) GeneralDuration, 0));
			}
			if (sword.getOrCreateTag().getBoolean("leach") == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.LEACH.get(), (int) GeneralDuration, 0));
			}
			if (sword.getOrCreateTag().getBoolean("thermogenesis") == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.THERMOGENESIS.get(), (int) GeneralDuration, 0));
			}
			if (sword.getOrCreateTag().getBoolean("toxin") == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.TOXIN.get(), (int) GeneralDuration, 0));
			}
			if (sword.getOrCreateTag().getBoolean("worm") == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.NEUROTOXIN.get(), (int) GeneralDuration, 0));
			}
			if (sword.getOrCreateTag().getBoolean("reanimation") == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.REANIMATING_TOXIN.get(), (int) GeneralDuration, 0));
			}
			if (sword.getOrCreateTag().getBoolean("Poisonus Plague") == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.POISONUS_PLAGUE.get(), (int) GeneralDuration, 0));
			}
			if (sword.getOrCreateTag().getBoolean("Grill Lungs") == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.GRILL_LUNGS.get(), (int) GeneralDuration, 0));
			}
			if (sword.getOrCreateTag().getBoolean("hyperfixation") == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.HYPERFIXATION.get(), (int) GeneralDuration, 0));
			}
			if (sword.getOrCreateTag().getBoolean("vanish") == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.VANISH.get(), (int) GeneralDuration, 0));
			}
			if (sword.getOrCreateTag().getBoolean("combustion") == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.COMBUSTION.get(), (int) GeneralDuration, 0));
			}
			if (sword.getOrCreateTag().getBoolean("overchargeleg") == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.OVERCHARGED_LEGS.get(), (int) GeneralDuration, 0));
			}
			if (sword.getOrCreateTag().getBoolean("blackout") == true) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(PoisonMadnessModMobEffects.BLACKOUT.get(), (int) GeneralDuration, 0));
			}
		}
	}
}
