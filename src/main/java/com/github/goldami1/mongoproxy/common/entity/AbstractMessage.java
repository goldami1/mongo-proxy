package com.github.goldami1.mongoproxy.common.entity;

import lombok.Builder;
import lombok.Value;
import lombok.extern.apachecommons.CommonsLog;

public abstract class AbstractMessage
{
	protected static final Integer ZERO = 0;
	
	private MessageHeader header;
	
	protected AbstractMessage(MessageHeader header)
	{
		this.header = header;
	}
}
