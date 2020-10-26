package com.github.goldami1.mongoproxy.common.entity;

import java.util.List;
import lombok.Value;

//@Value
public class KillCursorsOperation extends AbstractMessage
{
	private Integer zero = ZERO;
	private Integer numberOfCursorIds;
	private Long[] cursorIds;
	
	protected KillCursorsOperation(MessageHeader header)
	{
		super(header);
	}
}
