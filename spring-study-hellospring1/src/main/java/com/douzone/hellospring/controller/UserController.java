package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.douzone.hellospring.vo.UserVo;

/*
 * request mapping : type + method
 * 
 */

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "/WEB-INF/views/joinform.jsp";
	}

	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping("/join") public String join() { return
	 * "UserController:join()"; }
	 */

	@ResponseBody
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	// @ModelAttribute 붙여 주는 게 좋다. UserVo를 검사함으로써
	public String join(@ModelAttribute UserVo userVo) {
		System.out.println(userVo);
		return "UserController:join()";
	}

	@ResponseBody
	@RequestMapping("/login")
	public String login() {
		return "UserController:login()";
	}

	@ResponseBody
	@RequestMapping("/loginform")
	public String loginform() {
		return "UserController:loginform()";
	}

}
