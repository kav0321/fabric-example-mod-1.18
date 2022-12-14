package net.kav.soul;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;
import net.kav.soul.client.gui.SoulKavOverlay;
import net.kav.soul.event.EntityDeath;
import net.kav.soul.event.KeyInputHandler;
import net.kav.soul.networking.ModMessages;
import net.kav.soul.procedures.soukavgetexp;
import net.kav.soul.util.SoulData;

public class SoulClient implements ClientModInitializer {


    @Override
    public void onInitializeClient() {

        KeyInputHandler.register();
        ModMessages.registerS2CPackets();
        HudRenderCallback.EVENT.register(new SoulKavOverlay());


    }
}
