package com.github.goldami1.mongoproxy.common.entity;

import lombok.Value;
import org.bson.Document;

//@Value
public class QueryOperation extends AbstractMessage
{
	private Integer flags;
	private String fullCollectionName;
	private Integer numberToSkip;
	private Integer numberToReturn;
	private Document query;
	private Document returnFieldsSelector;
	
	protected QueryOperation(MessageHeader header)
	{
		super(header);
	}
}
