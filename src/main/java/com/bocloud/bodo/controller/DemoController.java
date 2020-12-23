package com.bocloud.bodo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lifubei
 * @date 2020/04/10 16:27
 */
@RestController
public class DemoController {

	@GetMapping("")
	public String demo(){
		return "支撑DevOps最佳实践落地 \n 简洁易用，双态支撑，深度匹配DevOps体系标准";
	}
}
