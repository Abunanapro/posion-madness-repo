package net.mcreator.seventhancientwayssub.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.seventhancientwayssub.entity.LightGreenToadEntity;

public class LightGreenToadModel extends GeoModel<LightGreenToadEntity> {
	@Override
	public ResourceLocation getAnimationResource(LightGreenToadEntity entity) {
		return new ResourceLocation("poison_madness", "animations/toad.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LightGreenToadEntity entity) {
		return new ResourceLocation("poison_madness", "geo/toad.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LightGreenToadEntity entity) {
		return new ResourceLocation("poison_madness", "textures/entities/" + entity.getTexture() + ".png");
	}

}
