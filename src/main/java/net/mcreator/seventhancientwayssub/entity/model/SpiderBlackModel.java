package net.mcreator.seventhancientwayssub.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.seventhancientwayssub.entity.SpiderBlackEntity;

public class SpiderBlackModel extends GeoModel<SpiderBlackEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpiderBlackEntity entity) {
		return new ResourceLocation("poison_madness", "animations/spider.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpiderBlackEntity entity) {
		return new ResourceLocation("poison_madness", "geo/spider.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpiderBlackEntity entity) {
		return new ResourceLocation("poison_madness", "textures/entities/" + entity.getTexture() + ".png");
	}

}
