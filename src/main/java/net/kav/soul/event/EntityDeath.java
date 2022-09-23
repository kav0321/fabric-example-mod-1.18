package net.kav.soul.event;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.kav.soul.networking.ModMessages;
import net.kav.soul.networking.packet.SoulingC2SPacket;
import net.kav.soul.util.SoulData;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;

public class EntityDeath implements ServerEntityCombatEvents.AfterKilledOtherEntity{
    @Override
    public void afterKilledOtherEntity(ServerWorld world, Entity entity, LivingEntity killedEntity) {

        if(!world.isClient())
        {


            ClientPlayNetworking.send(ModMessages.EXAMPLE_ID, PacketByteBufs.create());


        }

    }
}
