package net.kav.soul.event;

import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.kav.soul.util.IEntityDataSaver;
import net.kav.soul.util.SoulData;
import net.minecraft.server.network.ServerPlayerEntity;

public class PlayerDeath implements  ServerPlayerEvents.AfterRespawn{
    @Override
    public void afterRespawn(ServerPlayerEntity oldPlayer, ServerPlayerEntity newPlayer, boolean alive) {


        SoulData.setsoul(((IEntityDataSaver) newPlayer),0);
    }
}
