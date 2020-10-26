package com.github.goldami1.mongoproxy.common.entity;

import lombok.Value;

@Value
public class MessageHeader
{
	private Integer messageLength;  // total size of message in bytes. It includes 4 bytes which holds the message length
	private Integer requestId;
	private Integer responseTo;
	private OpCode opCode;
}
