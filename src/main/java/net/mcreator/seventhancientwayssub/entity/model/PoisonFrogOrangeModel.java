package net.mcreator.seventhancientwayssub.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.seventhancientwayssub.entity.PoisonFrogOrangeEntity;

public class PoisonFrogOrangeModel extends GeoModel<PoisonFrogOrangeEntity> {
	@Override
	public ResourceLocation getAnimationResource(PoisonFrogOrangeEntity entity) {
		return new ResourceLocation("poison_madness", "animations/poison_dart_frog.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PoisonFrogOrangeEntity entity) {
		return new ResourceLocation("poison_madness", "geo/poison_dart_frog.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PoisonFrogOrangeEntity entity) {
		return new ResourceLocation("poison_madness", "textures/entities/" + entity.getTexture() + ".png");
	}

}
