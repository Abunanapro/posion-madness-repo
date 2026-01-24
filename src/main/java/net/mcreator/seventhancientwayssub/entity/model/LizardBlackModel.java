package net.mcreator.seventhancientwayssub.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.seventhancientwayssub.entity.LizardBlackEntity;

public class LizardBlackModel extends GeoModel<LizardBlackEntity> {
	@Override
	public ResourceLocation getAnimationResource(LizardBlackEntity entity) {
		return new ResourceLocation("poison_madness", "animations/lizard.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LizardBlackEntity entity) {
		return new ResourceLocation("poison_madness", "geo/lizard.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LizardBlackEntity entity) {
		return new ResourceLocation("poison_madness", "textures/entities/" + entity.getTexture() + ".png");
	}

}
