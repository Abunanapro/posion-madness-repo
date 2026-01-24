
package net.mcreator.seventhancientwayssub.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ReanimatingToxinMobEffect extends MobEffect {
	public ReanimatingToxinMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -4224256);
	}

	@Override
	public String getDescriptionId() {
		return "effect.poison_madness.reanimating_toxin";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
