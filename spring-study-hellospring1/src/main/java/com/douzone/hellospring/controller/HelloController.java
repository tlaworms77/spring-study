package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	// @ResponseBody // 빨리결과보기위해서 그냥 단것 이것은 json응답할 때 사용 text 같은 것을 뛰워 준다
	@RequestMapping({"/hello", "/a/b/c/d", "/", ".com"})
	public String hello() {
		return "/WEB-INF/views/hello.jsp";
	}
}
