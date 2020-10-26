package com.github.goldami1.mongoproxy.common.entity;

import lombok.Value;
import org.bson.BsonBinary;

//@Value
public class MessageOperation extends AbstractMessage
{
	private Integer flagBits;
	private BsonBinary[] sections;
	
	protected MessageOperation(MessageHeader header)
	{
		super(header);
	}
}
