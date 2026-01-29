package net.mcreator.seventhancientwayssub.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.seventhancientwayssub.world.inventory.Lizard1Menu;
import net.mcreator.seventhancientwayssub.network.Lizard1ButtonMessage;
import net.mcreator.seventhancientwayssub.PoisonMadnessMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Lizard1Screen extends AbstractContainerScreen<Lizard1Menu> {
	private final static HashMap<String, Object> guistate = Lizard1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_leftnewback;
	ImageButton imagebutton_rightnewnext;

	public Lizard1Screen(Lizard1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 172;
		this.imageHeight = 162;
	}

	private static final ResourceLocation texture = new ResourceLocation("poison_madness:textures/screens/lizard_1.png");

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

		guiGraphics.blit(new ResourceLocation("poison_madness:textures/screens/lizard1.png"), this.leftPos + -59, this.topPos + -4, 0, 0, 292, 180, 292, 180);

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
				PoisonMadnessMod.PACKET_HANDLER.sendToServer(new Lizard1ButtonMessage(0, x, y, z));
				Lizard1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_leftnewback", imagebutton_leftnewback);
		this.addRenderableWidget(imagebutton_leftnewback);
		imagebutton_rightnewnext = new ImageButton(this.leftPos + 229, this.topPos + 68, 32, 32, 0, 0, 32, new ResourceLocation("poison_madness:textures/screens/atlas/imagebutton_rightnewnext.png"), 32, 64, e -> {
			if (true) {
				PoisonMadnessMod.PACKET_HANDLER.sendToServer(new Lizard1ButtonMessage(1, x, y, z));
				Lizard1ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_rightnewnext", imagebutton_rightnewnext);
		this.addRenderableWidget(imagebutton_rightnewnext);
	}
}
