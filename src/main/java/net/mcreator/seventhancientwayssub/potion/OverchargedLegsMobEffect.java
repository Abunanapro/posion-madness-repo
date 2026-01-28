
package net.mcreator.seventhancientwayssub.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class OverchargedLegsMobEffect extends MobEffect {
	public OverchargedLegsMobEffect() {
		super(MobEffectCategory.HARMFUL, -14745856);
	}

	@Override
	public String getDescriptionId() {
		return "effect.poison_madness.overcharged_legs";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
