package com.github.goldami1.mongoproxy.common.entity;

import lombok.Value;

//@Value
public class GetMoreOperation extends AbstractMessage
{
	private Integer zero = ZERO;
	private String fullCollectionName;
	private Integer numberToReturn;
	private Long cursorId;
	
	protected GetMoreOperation(MessageHeader header)
	{
		super(header);
	}
}
