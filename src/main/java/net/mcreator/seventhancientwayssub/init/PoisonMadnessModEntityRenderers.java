
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.seventhancientwayssub.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.seventhancientwayssub.client.renderer.SpiderBlackRenderer;
import net.mcreator.seventhancientwayssub.client.renderer.PoisonFrogYellowRenderer;
import net.mcreator.seventhancientwayssub.client.renderer.PoisonFrogVioletRenderer;
import net.mcreator.seventhancientwayssub.client.renderer.PoisonFrogRedWhiteRenderer;
import net.mcreator.seventhancientwayssub.client.renderer.PoisonFrogRedRenderer;
import net.mcreator.seventhancientwayssub.client.renderer.PoisonFrogPinkRenderer;
import net.mcreator.seventhancientwayssub.client.renderer.PoisonFrogOrangeRenderer;
import net.mcreator.seventhancientwayssub.client.renderer.PoisonFrogGreenRenderer;
import net.mcreator.seventhancientwayssub.client.renderer.PoisonFrogGoldenRenderer;
import net.mcreator.seventhancientwayssub.client.renderer.PoisonFrogDarkRenderer;
import net.mcreator.seventhancientwayssub.client.renderer.PoisonFrogDarkPurpleRenderer;
import net.mcreator.seventhancientwayssub.client.renderer.PoisonFrogCyanRenderer;
import net.mcreator.seventhancientwayssub.client.renderer.PoisonFrogCrimsonRenderer;
import net.mcreator.seventhancientwayssub.client.renderer.PoisonFrogCommonRenderer;
import net.mcreator.seventhancientwayssub.client.renderer.PoisonFrogBlueRenderer;
import net.mcreator.seventhancientwayssub.client.renderer.LizardBrownRenderer;
import net.mcreator.seventhancientwayssub.client.renderer.LizardBlackRenderer;
import net.mcreator.seventhancientwayssub.client.renderer.LizardBlack2Renderer;
import net.mcreator.seventhancientwayssub.client.renderer.LightGreenToadRenderer;
import net.mcreator.seventhancientwayssub.client.renderer.GreenToadRenderer;
import net.mcreator.seventhancientwayssub.client.renderer.DartRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PoisonMadnessModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PoisonMadnessModEntities.POISON_FROG_GOLDEN.get(), PoisonFrogGoldenRenderer::new);
		event.registerEntityRenderer(PoisonMadnessModEntities.POISON_FROG_BLUE.get(), PoisonFrogBlueRenderer::new);
		event.registerEntityRenderer(PoisonMadnessModEntities.POISON_FROG_ORANGE.get(), PoisonFrogOrangeRenderer::new);
		event.registerEntityRenderer(PoisonMadnessModEntities.POISON_FROG_CRIMSON.get(), PoisonFrogCrimsonRenderer::new);
		event.registerEntityRenderer(PoisonMadnessModEntities.POISON_FROG_RED.get(), PoisonFrogRedRenderer::new);
		event.registerEntityRenderer(PoisonMadnessModEntities.POISON_FROG_GREEN.get(), PoisonFrogGreenRenderer::new);
		event.registerEntityRenderer(PoisonMadnessModEntities.POISON_FROG_PINK.get(), PoisonFrogPinkRenderer::new);
		event.registerEntityRenderer(PoisonMadnessModEntities.POISON_FROG_DARK.get(), PoisonFrogDarkRenderer::new);
		event.registerEntityRenderer(PoisonMadnessModEntities.POISON_FROG_VIOLET.get(), PoisonFrogVioletRenderer::new);
		event.registerEntityRenderer(PoisonMadnessModEntities.POISON_FROG_CYAN.get(), PoisonFrogCyanRenderer::new);
		event.registerEntityRenderer(PoisonMadnessModEntities.POISON_FROG_COMMON.get(), PoisonFrogCommonRenderer::new);
		event.registerEntityRenderer(PoisonMadnessModEntities.POISON_FROG_DARK_PURPLE.get(), PoisonFrogDarkPurpleRenderer::new);
		event.registerEntityRenderer(PoisonMadnessModEntities.POISON_FROG_YELLOW.get(), PoisonFrogYellowRenderer::new);
		event.registerEntityRenderer(PoisonMadnessModEntities.LIZARD_BLACK.get(), LizardBlackRenderer::new);
		event.registerEntityRenderer(PoisonMadnessModEntities.GREEN_TOAD.get(), GreenToadRenderer::new);
		event.registerEntityRenderer(PoisonMadnessModEntities.SPIDER_BLACK.get(), SpiderBlackRenderer::new);
		event.registerEntityRenderer(PoisonMadnessModEntities.POISON_FROG_RED_WHITE.get(), PoisonFrogRedWhiteRenderer::new);
		event.registerEntityRenderer(PoisonMadnessModEntities.LIZARD_BLACK_2.get(), LizardBlack2Renderer::new);
		event.registerEntityRenderer(PoisonMadnessModEntities.LIZARD_BROWN.get(), LizardBrownRenderer::new);
		event.registerEntityRenderer(PoisonMadnessModEntities.DART.get(), DartRenderer::new);
		event.registerEntityRenderer(PoisonMadnessModEntities.LIGHT_GREEN_TOAD.get(), LightGreenToadRenderer::new);
	}
}
