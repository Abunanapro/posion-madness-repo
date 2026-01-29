package net.mcreator.seventhancientwayssub.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.seventhancientwayssub.world.inventory.Index2Menu;
import net.mcreator.seventhancientwayssub.network.Index2ButtonMessage;
import net.mcreator.seventhancientwayssub.PoisonMadnessMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Index2Screen extends AbstractContainerScreen<Index2Menu> {
	private final static HashMap<String, Object> guistate = Index2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_leftnewback;

	public Index2Screen(Index2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 172;
		this.imageHeight = 162;
	}

	private static final ResourceLocation texture = new ResourceLocation("poison_madness:textures/screens/index_2.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("poison_madness:textures/screens/darticon.png"), this.leftPos + 32, this.topPos + 4, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(new ResourceLocation("poison_madness:textures/screens/quest_gui_weapon.png"), this.leftPos + -59, this.topPos + -4, 0, 0, 292, 180, 292, 180);

		guiGraphics.blit(new ResourceLocation("poison_madness:textures/screens/iconmeleepoisoning.png"), this.leftPos + 121, this.topPos + 23, 0, 0, 64, 64, 64, 64);

		guiGraphics.blit(new ResourceLocation("poison_madness:textures/screens/darticon.png"), this.leftPos + -5, this.topPos + 5, 0, 0, 32, 32, 32, 32);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.poison_madness.index_2.label_darts"), -42, 17, -14548767, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.poison_madness.index_2.label_right_click_to_coat_the_dart"), -44, 37, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.poison_madness.index_2.label_a_frog_lizard_toad"), -44, 52, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.poison_madness.index_2.label_spider"), -43, 65, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.poison_madness.index_2.label_dart_with_their_poison"), -44, 77, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.poison_madness.index_2.label_you_can_coat_a_dart"), -43, 89, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.poison_madness.index_2.label_with_up_to_3_poisons"), -42, 100, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.poison_madness.index_2.label_in_one_dart"), -42, 110, -16777216, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_leftnewback = new ImageButton(this.leftPos + -87, this.topPos + 65, 32, 32, 0, 0, 32, new ResourceLocation("poison_madness:textures/screens/atlas/imagebutton_leftnewback.png"), 32, 64, e -> {
			if (true) {
				PoisonMadnessMod.PACKET_HANDLER.sendToServer(new Index2ButtonMessage(0, x, y, z));
				Index2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_leftnewback", imagebutton_leftnewback);
		this.addRenderableWidget(imagebutton_leftnewback);
	}
}
