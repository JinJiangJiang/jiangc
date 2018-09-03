package com.jiang.netty;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.concurrent.GlobalEventExecutor;

import java.time.LocalDateTime;

/**
 * Created by biu on 2018/8/9.
 */
public class ChatHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {

    // 设置静态channel队列，用于群发消息
    private static ChannelGroup clients = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame msg)
            throws Exception {
        // 获取客户端发来的消息
        String content = msg.text();
        System.out.println("receive:" + content);

        // 轮训channel，发送消息
        for(Channel cn:clients){
            cn.writeAndFlush(new TextWebSocketFrame("服务器" + LocalDateTime.now() + "：" + content));
        }
        // 与上述方法一样效果
        //clients.writeAndFlush(new TextWebSocketFrame("服务器" + LocalDateTime.now() + "：" + content));
    }

    /**
     * 添加handler的时候，将该channel添加进clients
     * @param ctx
     * @throws Exception
     */
    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        clients.add(ctx.channel());
        super.handlerAdded(ctx);
    }

    /**
     * 移除handler的时候，将channel从clients中移除（自动）
     * @param ctx
     * @throws Exception
     */
    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        //clients.remove(ctx.channel());
        super.handlerRemoved(ctx);
        System.out.println("长ID" + ctx.channel().id().asLongText());
        System.out.println("短ID" + ctx.channel().id().asShortText());
    }
}
