package com.gmail.lynx7478.anni.anniGame.autoRespawn.versions;

import net.minecraft.server.v1_8_R1.EnumClientCommand;
import net.minecraft.server.v1_8_R1.PacketPlayInClientCommand;

import org.bukkit.craftbukkit.v1_8_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import com.gmail.lynx7478.anni.anniGame.autoRespawn.RespawnPacket;

public class v1_8_R1Packet implements RespawnPacket
{
    private final PacketPlayInClientCommand packet;
    public v1_8_R1Packet()
    {
        packet = new PacketPlayInClientCommand(EnumClientCommand.PERFORM_RESPAWN);
    }

    @Override
    public void sendToPlayer(final Player player)
    {
        CraftPlayer p = (CraftPlayer)player;
        p.getHandle().playerConnection.a(packet);
    }
}
