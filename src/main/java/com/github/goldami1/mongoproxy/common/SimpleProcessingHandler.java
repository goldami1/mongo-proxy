package com.github.goldami1.mongoproxy.common;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class SimpleProcessingHandler extends ChannelInboundHandlerAdapter
{
	private ByteBuf byteBuffer;
	
	@Override
	public void handlerAdded(ChannelHandlerContext ctx) throws Exception
	{
		super.handlerAdded(ctx);
	}
	
	@Override
	public void handlerRemoved(ChannelHandlerContext ctx) throws Exception
	{
		super.handlerRemoved(ctx);
	}
	
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception
	{
		super.channelRead(ctx, msg);
	}
}
