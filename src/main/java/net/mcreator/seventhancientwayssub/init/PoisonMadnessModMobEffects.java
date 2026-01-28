
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.seventhancientwayssub.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.seventhancientwayssub.potion.VulnerabilityMobEffect;
import net.mcreator.seventhancientwayssub.potion.VanishMobEffect;
import net.mcreator.seventhancientwayssub.potion.ToxinMobEffect;
import net.mcreator.seventhancientwayssub.potion.TorporMobEffect;
import net.mcreator.seventhancientwayssub.potion.ThermogenesisMobEffect;
import net.mcreator.seventhancientwayssub.potion.StimulationMobEffect;
import net.mcreator.seventhancientwayssub.potion.ReanimatingToxinMobEffect;
import net.mcreator.seventhancientwayssub.potion.PoisonusPlagueMobEffect;
import net.mcreator.seventhancientwayssub.potion.NumbnessMobEffect;
import net.mcreator.seventhancientwayssub.potion.NeurotoxinMobEffect;
import net.mcreator.seventhancientwayssub.potion.LeachMobEffect;
import net.mcreator.seventhancientwayssub.potion.HypersalivationMobEffect;
import net.mcreator.seventhancientwayssub.potion.HyperfixationMobEffect;
import net.mcreator.seventhancientwayssub.potion.GrillLungsMobEffect;
import net.mcreator.seventhancientwayssub.potion.ConfusionMobEffect;
import net.mcreator.seventhancientwayssub.potion.CombustionMobEffect;
import net.mcreator.seventhancientwayssub.potion.ComaMobEffect;
import net.mcreator.seventhancientwayssub.potion.BatrachotoxinMobEffect;
import net.mcreator.seventhancientwayssub.PoisonMadnessMod;

public class PoisonMadnessModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PoisonMadnessMod.MODID);
	public static final RegistryObject<MobEffect> BATRACHOTOXIN = REGISTRY.register("batrachotoxin", () -> new BatrachotoxinMobEffect());
	public static final RegistryObject<MobEffect> COMA = REGISTRY.register("coma", () -> new ComaMobEffect());
	public static final RegistryObject<MobEffect> VULNERABILITY = REGISTRY.register("vulnerability", () -> new VulnerabilityMobEffect());
	public static final RegistryObject<MobEffect> TORPOR = REGISTRY.register("torpor", () -> new TorporMobEffect());
	public static final RegistryObject<MobEffect> STIMULATION = REGISTRY.register("stimulation", () -> new StimulationMobEffect());
	public static final RegistryObject<MobEffect> NUMBNESS = REGISTRY.register("numbness", () -> new NumbnessMobEffect());
	public static final RegistryObject<MobEffect> CONFUSION = REGISTRY.register("confusion", () -> new ConfusionMobEffect());
	public static final RegistryObject<MobEffect> HYPERSALIVATION = REGISTRY.register("hypersalivation", () -> new HypersalivationMobEffect());
	public static final RegistryObject<MobEffect> LEACH = REGISTRY.register("leach", () -> new LeachMobEffect());
	public static final RegistryObject<MobEffect> THERMOGENESIS = REGISTRY.register("thermogenesis", () -> new ThermogenesisMobEffect());
	public static final RegistryObject<MobEffect> TOXIN = REGISTRY.register("toxin", () -> new ToxinMobEffect());
	public static final RegistryObject<MobEffect> NEUROTOXIN = REGISTRY.register("neurotoxin", () -> new NeurotoxinMobEffect());
	public static final RegistryObject<MobEffect> REANIMATING_TOXIN = REGISTRY.register("reanimating_toxin", () -> new ReanimatingToxinMobEffect());
	public static final RegistryObject<MobEffect> POISONUS_PLAGUE = REGISTRY.register("poisonus_plague", () -> new PoisonusPlagueMobEffect());
	public static final RegistryObject<MobEffect> GRILL_LUNGS = REGISTRY.register("grill_lungs", () -> new GrillLungsMobEffect());
	public static final RegistryObject<MobEffect> HYPERFIXATION = REGISTRY.register("hyperfixation", () -> new HyperfixationMobEffect());
	public static final RegistryObject<MobEffect> VANISH = REGISTRY.register("vanish", () -> new VanishMobEffect());
	public static final RegistryObject<MobEffect> COMBUSTION = REGISTRY.register("combustion", () -> new CombustionMobEffect());
}
