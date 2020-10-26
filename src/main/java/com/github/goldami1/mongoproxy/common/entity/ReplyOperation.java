package com.github.goldami1.mongoproxy.common.entity;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.extern.apachecommons.CommonsLog;
import org.bson.Document;

@CommonsLog
@Value
@EqualsAndHashCode(callSuper = true)
public class ReplyOperation extends AbstractMessage
{
	private Integer responseFlags;
	private Long cursorId;
	private Integer startingFrom;
	private Integer numberReturned;
	private Document[] documents;
	
	@Builder
	public ReplyOperation(
		Integer responseFlags,
		Long cursorId,
		Integer startingFrom,
		Integer numberReturned,
		Document[] documents)
	{
		super(null);
		this.responseFlags = responseFlags;
		this.cursorId = cursorId;
		this.startingFrom = startingFrom;
		this.numberReturned = numberReturned;
		this.documents = documents;
	}
	
	public void log()
	{
		log.info("hello");
	}
}
