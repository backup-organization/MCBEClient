package jp.dip.hmy2001.mcbeClient.network.mcbe.protocol;

import jp.dip.hmy2001.mcbeClient.network.mcbe.GamePacket;

public class AddActorPacket extends GamePacket {

    public long entityUniqueId;
    public long entityRuntimeId;
    public String type;

    public byte getPacketId() {
        return ProtocolInfo.ADD_ACTOR_PACKET;
    }

    public void decodeBody(){
        entityUniqueId = readEntityUniqueId();
        entityRuntimeId = readEntityRuntimeId();
        type = readString();
    }

}
