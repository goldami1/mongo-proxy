package com.github.goldami1.mongoproxy.common.entity;

import lombok.Value;
import org.bson.Document;

//@Value
public class UpdateOperation extends AbstractMessage
{
	private Integer zero = ZERO;
	private String fullCollectionName;
	private Integer flags;
	private Document selector;
	private Document update;
	
	protected UpdateOperation(MessageHeader header)
	{
		super(header);
	}
}
