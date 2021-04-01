package com.lixiande.server;

import com.lixiande.proto.GameMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.SimpleChannelInboundHandler;

public class GameServerHandler extends SimpleChannelInboundHandler<GameMessage.Info> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, GameMessage.Info msg) throws Exception {
        System.out.println(msg.getPort());
        System.out.println(msg.getInfo());
        GameMessage.Info info = GameMessage.Info.newBuilder().setInfo("what the fuck!").setPort(10086).build();
        ctx.channel().writeAndFlush(info);
    }
}
