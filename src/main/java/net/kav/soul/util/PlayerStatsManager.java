package net.kav.soul.util;

import net.minecraft.nbt.NbtCompound;

public class PlayerStatsManager {

    public int totalLevelExperience;


    public void writeNbt(NbtCompound tag){
        tag.putInt("TotalLevelExperience", this.totalLevelExperience);
    }
}
