package net.mcreator.seventhancientwayssub.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.seventhancientwayssub.entity.PoisonFrogVioletEntity;

public class PoisonFrogVioletModel extends GeoModel<PoisonFrogVioletEntity> {
	@Override
	public ResourceLocation getAnimationResource(PoisonFrogVioletEntity entity) {
		return new ResourceLocation("poison_madness", "animations/poison_dart_frog.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PoisonFrogVioletEntity entity) {
		return new ResourceLocation("poison_madness", "geo/poison_dart_frog.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PoisonFrogVioletEntity entity) {
		return new ResourceLocation("poison_madness", "textures/entities/" + entity.getTexture() + ".png");
	}

}
