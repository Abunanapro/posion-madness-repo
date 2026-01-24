package net.mcreator.seventhancientwayssub.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.seventhancientwayssub.entity.PoisonFrogCrimsonEntity;

public class PoisonFrogCrimsonModel extends GeoModel<PoisonFrogCrimsonEntity> {
	@Override
	public ResourceLocation getAnimationResource(PoisonFrogCrimsonEntity entity) {
		return new ResourceLocation("poison_madness", "animations/poison_dart_frog.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PoisonFrogCrimsonEntity entity) {
		return new ResourceLocation("poison_madness", "geo/poison_dart_frog.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PoisonFrogCrimsonEntity entity) {
		return new ResourceLocation("poison_madness", "textures/entities/" + entity.getTexture() + ".png");
	}

}
