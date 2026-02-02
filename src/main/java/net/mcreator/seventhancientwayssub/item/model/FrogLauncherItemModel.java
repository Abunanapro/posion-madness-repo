package net.mcreator.seventhancientwayssub.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.seventhancientwayssub.item.FrogLauncherItem;

public class FrogLauncherItemModel extends GeoModel<FrogLauncherItem> {
	@Override
	public ResourceLocation getAnimationResource(FrogLauncherItem animatable) {
		return new ResourceLocation("poison_madness", "animations/frog_cannon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FrogLauncherItem animatable) {
		return new ResourceLocation("poison_madness", "geo/frog_cannon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FrogLauncherItem animatable) {
		return new ResourceLocation("poison_madness", "textures/item/frogcanonimage.png");
	}
}
