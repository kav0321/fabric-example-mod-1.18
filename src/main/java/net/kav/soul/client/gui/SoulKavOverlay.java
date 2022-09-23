package net.kav.soul.client.gui;


import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.kav.soul.Soul;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class SoulKavOverlay implements HudRenderCallback{

    private static final Identifier Soul_kav = new Identifier(Soul.MOD_ID,"textures/soul/soul_display.png");
    private static final Identifier Soul_kav2= new Identifier(Soul.MOD_ID,"textures/soul/soul_display.png");

    public Identifier getSoularray(int x) {
        Identifier[] soularray = new Identifier[2];
        soularray[0] = new Identifier(Soul.MOD_ID,"textures/soul/soul_display.png");
        soularray[1]= new Identifier(Soul.MOD_ID,"textures/soul/soul_display_2.png");

        if(x==0)
        {
            return soularray[0];
        }
        else
            return soularray[1];

    }

    @Override
    public void onHudRender(MatrixStack matrixStack, float tickDelta) {
    int x =0;
    int y= 0;

        MinecraftClient client =MinecraftClient.getInstance();
        if(client!=null)
        {
            int width =client.getWindow().getScaledWidth();
            int heigth =client.getWindow().getScaledHeight();
            x=width/2;
            y=heigth;
        }

        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F,1.0F,1.0F,1.0F);

        RenderSystem.setShaderTexture(0, getSoularray(0));
        DrawableHelper.drawTexture(matrixStack,x+130,y-40,0,0,12,12,12,12,12);






    }




}



