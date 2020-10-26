package com.github.goldami1.mongoproxy.common.entity;

import java.util.List;
import lombok.Value;
import org.bson.Document;

//@Value
public class InsertOperation extends AbstractMessage
{
	private Integer flags;
	private String fullCollectionName;
	private Document[] documents;
	
	protected InsertOperation(MessageHeader header)
	{
		super(header);
	}
}
