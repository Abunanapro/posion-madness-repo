package net.mcreator.seventhancientwayssub.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.seventhancientwayssub.entity.LizardBrownEntity;

public class LizardBrownModel extends GeoModel<LizardBrownEntity> {
	@Override
	public ResourceLocation getAnimationResource(LizardBrownEntity entity) {
		return new ResourceLocation("poison_madness", "animations/lizard.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LizardBrownEntity entity) {
		return new ResourceLocation("poison_madness", "geo/lizard.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LizardBrownEntity entity) {
		return new ResourceLocation("poison_madness", "textures/entities/" + entity.getTexture() + ".png");
	}

}
