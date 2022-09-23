package net.kav.soul.util;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.MinecraftServer;

public class SoulData {


    public static float addsoul(IEntityDataSaver player, float amount) {
        NbtCompound nbt = player.getPersistentData();
        float soul = nbt.getFloat("soul");

        if (soul >= 69000000) {
            soul = 69000000;
        } else {
            soul = soul + amount;
        }

        nbt.putFloat("soul", soul);

        return soul;

    }

    public static void setsoul(IEntityDataSaver player,int a)
    {
        NbtCompound nbt = player.getPersistentData();
        float soul = nbt.getInt("soul");

         soul= a;
        nbt.putFloat("soul", soul);
    }




    public static float remove(IEntityDataSaver player, float amount) {
        NbtCompound nbt = player.getPersistentData();
        float soul = nbt.getInt("Souls");

        if (soul < 0) {
            soul = 0;
        } else {
            soul -= amount;
        }

        nbt.putFloat("soul", soul);
        //syncThirst(thirst, (ServerPlayerEntity) player);
        return soul;

    }


}