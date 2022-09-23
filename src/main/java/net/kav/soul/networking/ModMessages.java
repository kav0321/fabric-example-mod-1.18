package net.kav.soul.networking;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.kav.soul.Soul;
import net.kav.soul.networking.packet.ExampleC2SPacket;

import net.kav.soul.networking.packet.SoulingC2SPacket;
import net.kav.soul.util.SoulData;
import net.minecraft.util.Identifier;

public class ModMessages {
    public static final Identifier GAINING_SOUL_ID = new Identifier(Soul.MOD_ID, "absorbing");
    public static final Identifier EXAMPLE_ID = new Identifier(Soul.MOD_ID,"example");


    public static void registerC2SPackets(){

        ServerPlayNetworking.registerGlobalReceiver(GAINING_SOUL_ID, SoulingC2SPacket::receiver);
    }

    public static void registerS2CPackets(){
        ServerPlayNetworking.registerGlobalReceiver(EXAMPLE_ID, ExampleC2SPacket::receive);

    }
}
