package net.kav.soul.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.kav.soul.procedures.soukavgetexp;
import net.kav.soul.util.IEntityDataSaver;
import net.kav.soul.util.SoulData;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;

public class SoulingC2SPacket {
    private  static final String MESSAGE= "Hello";
    public static float a=0;
    public static float Entitykilled(LivingEntity entity){

        a=entity.getHealth();
        return a;
    }

    public static void receiver(MinecraftServer minecraftServer, ServerPlayerEntity serverPlayerEntity, ServerPlayNetworkHandler serverPlayNetworkHandler, PacketByteBuf packetByteBuf, PacketSender responseSender) {
        ServerWorld world = serverPlayerEntity.getWorld();

        EntityType.COW.spawn(((ServerWorld) serverPlayerEntity.world), null, null, serverPlayerEntity, serverPlayerEntity.getBlockPos(), SpawnReason.TRIGGERED, true, false);

    }



}
