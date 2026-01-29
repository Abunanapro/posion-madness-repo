package net.mcreator.seventhancientwayssub.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.seventhancientwayssub.world.inventory.Lizard2Menu;
import net.mcreator.seventhancientwayssub.network.Lizard2ButtonMessage;
import net.mcreator.seventhancientwayssub.PoisonMadnessMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Lizard2Screen extends AbstractContainerScreen<Lizard2Menu> {
	private final static HashMap<String, Object> guistate = Lizard2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_leftnewback;
	ImageButton imagebutton_rightnewnext;
	ImageButton imagebutton_leftnewback1;

	public Lizard2Screen(Lizard2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 172;
		this.imageHeight = 162;
	}

	private static final ResourceLocation texture = new ResourceLocation("poison_madness:textures/screens/lizard_2.png");

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

		guiGraphics.blit(new ResourceLocation("poison_madness:textures/screens/lizard2.png"), this.leftPos + -59, this.topPos + -4, 0, 0, 292, 180, 292, 180);

		guiGraphics.blit(new ResourceLocation("poison_madness:textures/screens/iconlizardsgreen.png"), this.leftPos + 49, this.topPos + 14, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("poison_madness:textures/screens/iconlizardsgreen.png"), this.leftPos + -41, this.topPos + 14, 0, 0, 16, 16, 16, 16);

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
				PoisonMadnessMod.PACKET_HANDLER.sendToServer(new Lizard2ButtonMessage(0, x, y, z));
				Lizard2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_leftnewback", imagebutton_leftnewback);
		this.addRenderableWidget(imagebutton_leftnewback);
		imagebutton_rightnewnext = new ImageButton(this.leftPos + 229, this.topPos + 68, 32, 32, 0, 0, 32, new ResourceLocation("poison_madness:textures/screens/atlas/imagebutton_rightnewnext.png"), 32, 64, e -> {
		});
		guistate.put("button:imagebutton_rightnewnext", imagebutton_rightnewnext);
		this.addRenderableWidget(imagebutton_rightnewnext);
		imagebutton_leftnewback1 = new ImageButton(this.leftPos + -86, this.topPos + 68, 32, 32, 0, 0, 32, new ResourceLocation("poison_madness:textures/screens/atlas/imagebutton_leftnewback1.png"), 32, 64, e -> {
			if (true) {
				PoisonMadnessMod.PACKET_HANDLER.sendToServer(new Lizard2ButtonMessage(2, x, y, z));
				Lizard2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_leftnewback1", imagebutton_leftnewback1);
		this.addRenderableWidget(imagebutton_leftnewback1);
	}
}
