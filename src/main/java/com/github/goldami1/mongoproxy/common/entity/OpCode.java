package com.github.goldami1.mongoproxy.common.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

public enum OpCode
{
	OP_REPLY(1),
	OP_UPDATE(2001),
	OP_INSERT(2002),
	RESERVED(2003),
	OP_QUERY(2004),
	OP_GET_MORE(2005),
	OP_DELETE(2006),
	OP_KILL_CURSORS(2007),
	OP_MSG(2013);
	
	@Getter
	private final int value;
	
	OpCode(int value)
	{
		this.value = value;
	}
}
