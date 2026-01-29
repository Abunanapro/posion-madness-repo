package net.mcreator.seventhancientwayssub.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.seventhancientwayssub.world.inventory.ComingSoonMenu;
import net.mcreator.seventhancientwayssub.network.ComingSoonButtonMessage;
import net.mcreator.seventhancientwayssub.PoisonMadnessMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ComingSoonScreen extends AbstractContainerScreen<ComingSoonMenu> {
	private final static HashMap<String, Object> guistate = ComingSoonMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_leftnewback;

	public ComingSoonScreen(ComingSoonMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 172;
		this.imageHeight = 162;
	}

	private static final ResourceLocation texture = new ResourceLocation("poison_madness:textures/screens/coming_soon.png");

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

		guiGraphics.blit(new ResourceLocation("poison_madness:textures/screens/comingsoon.png"), this.leftPos + -59, this.topPos + -4, 0, 0, 292, 180, 292, 180);

		guiGraphics.blit(new ResourceLocation("poison_madness:textures/screens/iconmod.png"), this.leftPos + 130, this.topPos + 41, 0, 0, 64, 64, 64, 64);

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
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_leftnewback = new ImageButton(this.leftPos + -86, this.topPos + -4, 32, 32, 0, 0, 32, new ResourceLocation("poison_madness:textures/screens/atlas/imagebutton_leftnewback.png"), 32, 64, e -> {
			if (true) {
				PoisonMadnessMod.PACKET_HANDLER.sendToServer(new ComingSoonButtonMessage(0, x, y, z));
				ComingSoonButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_leftnewback", imagebutton_leftnewback);
		this.addRenderableWidget(imagebutton_leftnewback);
	}
}
