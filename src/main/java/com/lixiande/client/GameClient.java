package com.lixiande.client;

import com.lixiande.proto.GameMessage;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GameClient {
    static int PORT;

    public static void main(String[] args) {
        EventLoopGroup clientEvent = new NioEventLoopGroup();
        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(clientEvent)
                    .channel(NioSocketChannel.class)
                    .handler(new GameClientInitializer());
            Channel channel = bootstrap.connect("localhost", 10086).sync().channel();
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            ChannelFuture lastWriteFuture = null;
            while (true) {
                String line = in.readLine();
                if (line == null) {
                    break;
                }
                GameMessage.Info info = GameMessage.Info.newBuilder().setInfo(line).setPort(10086).build();
                lastWriteFuture = channel.writeAndFlush(info);

                if("bye".equals(line)){
                    channel.closeFuture().sync();
                    break;
                }
            }
            if(lastWriteFuture != null){
                lastWriteFuture.sync();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            clientEvent.shutdownGracefully();
        }
    }

}
