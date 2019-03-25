package com.douzone.hellospring.controller;

import java.io.Writer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Controller를 찾기위해서 하는 scan을 위한 어노테이션
public class MainController {
	
	@ResponseBody
	@RequestMapping({"/main", ""}) // request mapping을 : 메서드 단독 메핑
	public String main() {
		return "MainController:main()";
	}
	
	@ResponseBody
	@RequestMapping("/main/a/b/c/d") // request mapping을 : 메서드 단독 메핑
	public String main2() {
		return "MainController:main2()";
	}
	
	@ResponseBody
	@RequestMapping("/main3") // request mapping을 : 메서드 단독 메핑
	public String main3(HttpServletRequest request, Writer out) {
		String name = request.getParameter("n");
		return "MainController:main3()";
	}
	
}
