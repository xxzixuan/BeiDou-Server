package org.gms.net.netty;

import java.util.HashMap;
import java.util.Map;

import org.gms.util.Pair;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class LoginServer extends AbstractServer {
    public static final int WORLD_ID = -1;
    public static final int CHANNEL_ID = -1;
    private Channel channel;
    private static Map<Integer, Pair<Integer, Integer>> chrpos = new HashMap<>();

    public LoginServer(int port) {
        super(port);
    }

    public static void setChrPos(int keys, int x, int y) {
        chrpos.put(keys, new Pair<>(x, y));
    }

    public static Map<Integer, Pair<Integer, Integer>> getChrPos() {
        return chrpos;
    }

    public static void RemoveChrPos(int chrid) {
        chrpos.remove(chrid);
    }


    @Override
    public void start() {
        EventLoopGroup parentGroup = new NioEventLoopGroup();
        EventLoopGroup childGroup = new NioEventLoopGroup();
        ServerBootstrap bootstrap = new ServerBootstrap()
                .group(parentGroup, childGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(new LoginServerInitializer());

        this.channel = bootstrap.bind(port).syncUninterruptibly().channel();
    }

    @Override
    public void stop() {
        if (channel == null) {
            throw new IllegalStateException("Must start LoginServer before stopping it");
        }

        channel.close().syncUninterruptibly();
    }
}
