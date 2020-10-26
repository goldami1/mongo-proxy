package com.github.goldami1.mongoproxy.common.entity;

import lombok.Value;
import org.bson.Document;

//@Value
public class DeleteOperation extends AbstractMessage
{
	private Integer zero = ZERO;
	String fullCollectionName;
	Integer flags;
	Document selector;
	
	protected DeleteOperation(MessageHeader header)
	{
		super(header);
	}
}
