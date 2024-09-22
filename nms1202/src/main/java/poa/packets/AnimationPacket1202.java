package poa.packets;

import io.netty.buffer.Unpooled;
import lombok.SneakyThrows;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.protocol.game.ClientboundAnimatePacket;

import java.lang.reflect.Constructor;

public class AnimationPacket1202 {

    @SneakyThrows
    public static Object packet(int id, int animation){
        FriendlyByteBuf buf = new FriendlyByteBuf(Unpooled.buffer());
        buf.writeVarInt(id);
        buf.writeByte(animation);
        return new ClientboundAnimatePacket(buf);


    }
}
