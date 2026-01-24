package net.mcreator.seventhancientwayssub.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.seventhancientwayssub.entity.GreenToadEntity;

public class GreenToadModel extends GeoModel<GreenToadEntity> {
	@Override
	public ResourceLocation getAnimationResource(GreenToadEntity entity) {
		return new ResourceLocation("poison_madness", "animations/unknown.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GreenToadEntity entity) {
		return new ResourceLocation("poison_madness", "geo/unknown.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GreenToadEntity entity) {
		return new ResourceLocation("poison_madness", "textures/entities/" + entity.getTexture() + ".png");
	}

}
