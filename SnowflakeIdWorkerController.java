package com.snowflake;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SnowflakeIdWorkerController {
	@RequestMapping(value = "/snowId", method = RequestMethod.GET)
	public Long getFileList() {
		SnowflakeIdWorker idWorker = new SnowflakeIdWorker(1,1);
		long id = idWorker.nextId();
		return id;
	}

}
