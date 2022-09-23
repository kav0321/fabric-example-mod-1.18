package net.kav.soul.util;

import net.minecraft.nbt.NbtCompound;

public class PlayerDeathresetcounts {


    public static int playerdeath(IEntityDataSaver player, int amount) {
        NbtCompound nbt = player.getPersistentData();
        int deathsoul = nbt.getInt("Death");

        deathsoul=amount;
        nbt.putFloat("Death", deathsoul);

        return deathsoul;

    }

    public static int playerdeathresets(IEntityDataSaver player) {
        NbtCompound nbt = player.getPersistentData();
        int deathsoul = nbt.getInt("Death");

        deathsoul=0;
        nbt.putFloat("Death", deathsoul);

        return deathsoul;

    }


}
