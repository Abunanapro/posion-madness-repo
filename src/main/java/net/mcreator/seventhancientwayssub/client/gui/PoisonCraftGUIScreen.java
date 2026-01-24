package net.mcreator.seventhancientwayssub.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.seventhancientwayssub.world.inventory.PoisonCraftGUIMenu;
import net.mcreator.seventhancientwayssub.network.PoisonCraftGUIButtonMessage;
import net.mcreator.seventhancientwayssub.PoisonMadnessMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class PoisonCraftGUIScreen extends AbstractContainerScreen<PoisonCraftGUIMenu> {
	private final static HashMap<String, Object> guistate = PoisonCraftGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_copy_poison;

	public PoisonCraftGUIScreen(PoisonCraftGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("poison_madness:textures/screens/poison_craft_gui.png");

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

		guiGraphics.blit(new ResourceLocation("poison_madness:textures/screens/arrow.png"), this.leftPos + 48, this.topPos + 34, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.poison_madness.poison_craft_gui.label_darts"), 18, 70, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.poison_madness.poison_craft_gui.label_poison_darts"), 7, 9, -16777216, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_copy_poison = Button.builder(Component.translatable("gui.poison_madness.poison_craft_gui.button_copy_poison"), e -> {
			if (true) {
				PoisonMadnessMod.PACKET_HANDLER.sendToServer(new PoisonCraftGUIButtonMessage(0, x, y, z));
				PoisonCraftGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 76, this.topPos + 55, 82, 20).build();
		guistate.put("button:button_copy_poison", button_copy_poison);
		this.addRenderableWidget(button_copy_poison);
	}
}
