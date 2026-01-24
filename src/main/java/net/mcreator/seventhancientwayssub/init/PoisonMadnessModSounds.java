
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.seventhancientwayssub.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.seventhancientwayssub.PoisonMadnessMod;

public class PoisonMadnessModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PoisonMadnessMod.MODID);
	public static final RegistryObject<SoundEvent> FROGAMBIENT = REGISTRY.register("frogambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("poison_madness", "frogambient")));
	public static final RegistryObject<SoundEvent> HURTFROG = REGISTRY.register("hurtfrog", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("poison_madness", "hurtfrog")));
	public static final RegistryObject<SoundEvent> FROGDEATH = REGISTRY.register("frogdeath", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("poison_madness", "frogdeath")));
	public static final RegistryObject<SoundEvent> EMPTY = REGISTRY.register("empty", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("poison_madness", "empty")));
	public static final RegistryObject<SoundEvent> FILLFROGBOWL = REGISTRY.register("fillfrogbowl", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("poison_madness", "fillfrogbowl")));
	public static final RegistryObject<SoundEvent> HYPERSALIVATION_AUDIO = REGISTRY.register("hypersalivation_audio", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("poison_madness", "hypersalivation_audio")));
	public static final RegistryObject<SoundEvent> HYPERSALIVATION_NOT_SALIVATED = REGISTRY.register("hypersalivation_not_salivated", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("poison_madness", "hypersalivation_not_salivated")));
	public static final RegistryObject<SoundEvent> THROWDART = REGISTRY.register("throwdart", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("poison_madness", "throwdart")));
	public static final RegistryObject<SoundEvent> COATDART = REGISTRY.register("coatdart", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("poison_madness", "coatdart")));
}
