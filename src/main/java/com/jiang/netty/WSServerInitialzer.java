package com.jiang.netty;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.stream.ChunkedWriteHandler;

/**
 * Created by biu on 2018/8/9.
 */
public class WSServerInitialzer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        // 获取管道
        ChannelPipeline pipeline = channel.pipeline();

        /**
         * 支持http协议
         */
        // websocket给予http，添加http编解码器
        pipeline.addLast(new HttpServerCodec());
        // 添加对大数据流的写支持
        pipeline.addLast(new ChunkedWriteHandler());
        // 对HttpMessage进行聚合，聚合成FullHttpRequest或FullHttpResponse
        // 几乎在netty中都会用到
        pipeline.addLast(new HttpObjectAggregator(1024 * 64));

        /**
         * 支持WebSocket
         */
        // WebSocket服务器处理的协议，指定客户端访问的路由
        // 处理一些复杂的事情，如握手（handshaking）、心跳（ping + pong）
        // webSocket都是以frames形式传输的
        pipeline.addLast(new WebSocketServerProtocolHandler("/ws"));

        /**
         * 自定义Handler
         */
        pipeline.addLast(new ChatHandler());

    }
}
