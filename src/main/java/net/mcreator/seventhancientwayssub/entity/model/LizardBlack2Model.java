package net.mcreator.seventhancientwayssub.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.seventhancientwayssub.entity.LizardBlack2Entity;

public class LizardBlack2Model extends GeoModel<LizardBlack2Entity> {
	@Override
	public ResourceLocation getAnimationResource(LizardBlack2Entity entity) {
		return new ResourceLocation("poison_madness", "animations/lizard.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LizardBlack2Entity entity) {
		return new ResourceLocation("poison_madness", "geo/lizard.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LizardBlack2Entity entity) {
		return new ResourceLocation("poison_madness", "textures/entities/" + entity.getTexture() + ".png");
	}

}
