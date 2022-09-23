package net.kav.soul.procedures;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;

public class soukavgetexp {

    public static int getsouls(PlayerEntity player)
    {
       int x = player.totalExperience;

       return x;
    }


    }


//if (dependencies.get("entity")==null){
//            if(!dependencies.containsKey("entity"))
//            {Soul.LOGGER.warn("gitgud");}
//         return;
//
//        }
//        Entity entity = (Entity) dependencies.get("entity");
//        ClientPlayerEntity player= MinecraftClient.getInstance().player;
//        MinecraftClient mc = MinecraftClient.getInstance();
//    int x;
//        while(player!=null)
//            x = player.totalExperience;