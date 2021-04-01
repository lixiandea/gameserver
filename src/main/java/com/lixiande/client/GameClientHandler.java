package com.lixiande.client;

import com.lixiande.proto.GameMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.io.InputStream;

public class GameClientHandler extends SimpleChannelInboundHandler<GameMessage.Info> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, GameMessage.Info msg) throws Exception {
        System.out.println("port:"+ msg.getPort()+"info: " + msg.getInfo());
    }
}
