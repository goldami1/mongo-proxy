package com.github.goldami1.mongoproxy.application;

import com.github.goldami1.mongoproxy.common.entity.ReplyOperation;
import lombok.extern.apachecommons.CommonsLog;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;

@CommonsLog
public class Application
{
	public static void main(String[] args)
	{
		log.info("Starting Mongo Proxy App");
		var replyOp = new ReplyOperation(1, 1L, 1, 1, null);
	}
}
