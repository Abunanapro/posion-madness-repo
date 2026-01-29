package net.mcreator.seventhancientwayssub.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.seventhancientwayssub.world.inventory.IndexMenu;
import net.mcreator.seventhancientwayssub.network.IndexButtonMessage;
import net.mcreator.seventhancientwayssub.PoisonMadnessMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class IndexScreen extends AbstractContainerScreen<IndexMenu> {
	private final static HashMap<String, Object> guistate = IndexMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_sample;
	Button button_sample1;
	Button button_sample2;
	Button button_sample3;
	ImageButton imagebutton_rightnewnext;

	public IndexScreen(IndexMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 162;
	}

	private static final ResourceLocation texture = new ResourceLocation("poison_madness:textures/screens/index1.png");

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

		guiGraphics.blit(new ResourceLocation("poison_madness:textures/screens/quest_gui.png"), this.leftPos + -57, this.topPos + -4, 0, 0, 292, 180, 292, 180);

		guiGraphics.blit(new ResourceLocation("poison_madness:textures/screens/frogicon.png"), this.leftPos + 163, this.topPos + 18, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(new ResourceLocation("poison_madness:textures/screens/iconfrog2.png"), this.leftPos + 190, this.topPos + 19, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(new ResourceLocation("poison_madness:textures/screens/iconmod.png"), this.leftPos + -17, this.topPos + 85, 0, 0, 64, 64, 64, 64);

		guiGraphics.blit(new ResourceLocation("poison_madness:textures/screens/lizardicon.png"), this.leftPos + 162, this.topPos + 49, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(new ResourceLocation("poison_madness:textures/screens/iconlizard.png"), this.leftPos + 190, this.topPos + 49, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(new ResourceLocation("poison_madness:textures/screens/toadicon.png"), this.leftPos + 163, this.topPos + 81, 0, 0, 32, 32, 32, 32);

		guiGraphics.blit(new ResourceLocation("poison_madness:textures/screens/spicericon.png"), this.leftPos + 162, this.topPos + 110, 0, 0, 32, 32, 32, 32);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.poison_madness.index1.label_welcome_to_the_poison_codex"), -42, 15, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.poison_madness.index1.label_codex"), -42, 29, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.poison_madness.index1.label_here_you_will_find"), -42, 46, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.poison_madness.index1.label_the_poisonouse_species"), -43, 59, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.poison_madness.index1.label_that_this_mod_adds"), -43, 70, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.poison_madness.index1.label_adds"), -42, 83, -16777216, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_sample = Button.builder(Component.translatable("gui.poison_madness.index1.button_sample"), e -> {
			if (true) {
				PoisonMadnessMod.PACKET_HANDLER.sendToServer(new IndexButtonMessage(0, x, y, z));
				IndexButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 107, this.topPos + 23, 56, 20).build();
		guistate.put("button:button_sample", button_sample);
		this.addRenderableWidget(button_sample);
		button_sample1 = Button.builder(Component.translatable("gui.poison_madness.index1.button_sample1"), e -> {
			if (true) {
				PoisonMadnessMod.PACKET_HANDLER.sendToServer(new IndexButtonMessage(1, x, y, z));
				IndexButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 107, this.topPos + 54, 56, 20).build();
		guistate.put("button:button_sample1", button_sample1);
		this.addRenderableWidget(button_sample1);
		button_sample2 = Button.builder(Component.translatable("gui.poison_madness.index1.button_sample2"), e -> {
			if (true) {
				PoisonMadnessMod.PACKET_HANDLER.sendToServer(new IndexButtonMessage(2, x, y, z));
				IndexButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 106, this.topPos + 86, 56, 20).build();
		guistate.put("button:button_sample2", button_sample2);
		this.addRenderableWidget(button_sample2);
		button_sample3 = Button.builder(Component.translatable("gui.poison_madness.index1.button_sample3"), e -> {
			if (true) {
				PoisonMadnessMod.PACKET_HANDLER.sendToServer(new IndexButtonMessage(3, x, y, z));
				IndexButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 106, this.topPos + 116, 56, 20).build();
		guistate.put("button:button_sample3", button_sample3);
		this.addRenderableWidget(button_sample3);
		imagebutton_rightnewnext = new ImageButton(this.leftPos + 229, this.topPos + 65, 32, 32, 0, 0, 32, new ResourceLocation("poison_madness:textures/screens/atlas/imagebutton_rightnewnext.png"), 32, 64, e -> {
			if (true) {
				PoisonMadnessMod.PACKET_HANDLER.sendToServer(new IndexButtonMessage(4, x, y, z));
				IndexButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_rightnewnext", imagebutton_rightnewnext);
		this.addRenderableWidget(imagebutton_rightnewnext);
	}
}
