package net.mcreator.smpmodv.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.smpmodv.world.inventory.AlchemytableguiMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class AlchemytableguiScreen extends AbstractContainerScreen<AlchemytableguiMenu> {
	private final static HashMap<String, Object> guistate = AlchemytableguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public AlchemytableguiScreen(AlchemytableguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 243;
		this.imageHeight = 156;
	}

	private static final ResourceLocation texture = new ResourceLocation("smp_mod_v:textures/screens/alchemytablegui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("smp_mod_v:textures/screens/cross.png"));
		this.blit(ms, this.leftPos + 118, this.topPos + 38, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("smp_mod_v:textures/screens/arrow.png"));
		this.blit(ms, this.leftPos + 157, this.topPos + 39, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("smp_mod_v:textures/screens/texture.png"));
		this.blit(ms, this.leftPos + 66, this.topPos + 12, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("smp_mod_v:textures/screens/book.png"));
		this.blit(ms, this.leftPos + -109, this.topPos + -13, 0, 0, 256, 256, 256, 256);

		RenderSystem.setShaderTexture(0, new ResourceLocation("smp_mod_v:textures/screens/ore_gif.png"));
		this.blit(ms, this.leftPos + -5, this.topPos + 14, 0, 0, 16, 128, 16, 128);

		RenderSystem.setShaderTexture(0, new ResourceLocation("smp_mod_v:textures/screens/amethystdust.png"));
		this.blit(ms, this.leftPos + -53, this.topPos + 129, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("smp_mod_v:textures/screens/arroww.png"));
		this.blit(ms, this.leftPos + -30, this.topPos + 129, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("smp_mod_v:textures/screens/arroww.png"));
		this.blit(ms, this.leftPos + -30, this.topPos + 95, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("smp_mod_v:textures/screens/amethystdust.png"));
		this.blit(ms, this.leftPos + -53, this.topPos + 95, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("smp_mod_v:textures/screens/arroww.png"));
		this.blit(ms, this.leftPos + -30, this.topPos + 15, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("smp_mod_v:textures/screens/amethystdust.png"));
		this.blit(ms, this.leftPos + -53, this.topPos + 15, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("smp_mod_v:textures/screens/arroww.png"));
		this.blit(ms, this.leftPos + -30, this.topPos + 112, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("smp_mod_v:textures/screens/amethystdust.png"));
		this.blit(ms, this.leftPos + -52, this.topPos + 111, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("smp_mod_v:textures/screens/arroww.png"));
		this.blit(ms, this.leftPos + -30, this.topPos + 47, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("smp_mod_v:textures/screens/amethystdust.png"));
		this.blit(ms, this.leftPos + -53, this.topPos + 47, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("smp_mod_v:textures/screens/arroww.png"));
		this.blit(ms, this.leftPos + -30, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("smp_mod_v:textures/screens/amethystdust.png"));
		this.blit(ms, this.leftPos + -53, this.topPos + 31, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("smp_mod_v:textures/screens/arroww.png"));
		this.blit(ms, this.leftPos + -30, this.topPos + 63, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("smp_mod_v:textures/screens/amethystdust.png"));
		this.blit(ms, this.leftPos + -52, this.topPos + 62, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("smp_mod_v:textures/screens/arroww.png"));
		this.blit(ms, this.leftPos + -30, this.topPos + 78, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("smp_mod_v:textures/screens/amethystdust.png"));
		this.blit(ms, this.leftPos + -53, this.topPos + 78, 0, 0, 16, 16, 16, 16);

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
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.smp_mod_v.alchemytablegui.label_alchemy_table"), 92, 16, -3407668);
		this.font.draw(poseStack, Component.translatable("gui.smp_mod_v.alchemytablegui.label_8"), -41, 135, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.smp_mod_v.alchemytablegui.label_15"), -45, 101, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.smp_mod_v.alchemytablegui.label_4"), -40, 22, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.smp_mod_v.alchemytablegui.label_10"), -44, 117, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.smp_mod_v.alchemytablegui.label_6"), -41, 53, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.smp_mod_v.alchemytablegui.label_2"), -40, 36, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.smp_mod_v.alchemytablegui.label_32"), -43, 68, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.smp_mod_v.alchemytablegui.label_24"), -43, 84, -16777216);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
