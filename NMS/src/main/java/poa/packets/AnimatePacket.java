package poa.packets;

import poa.util.BukkitVersion;

public class AnimatePacket {

    public static Object packet(int id, int animation){
        return switch (BukkitVersion.getBukkitVersion()){
            case "1202" -> AnimationPacket1202.packet(id, animation);
            case "1204" -> AnimationPacket1204.packet(id, animation);
            case "1206" -> AnimationPacket1206.packet(id, animation);
            case "121" -> AnimationPacket121.packet(id, animation);
            default -> null;
        };
    }
}