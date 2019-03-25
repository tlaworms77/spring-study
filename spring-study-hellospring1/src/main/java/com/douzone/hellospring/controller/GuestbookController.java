package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * request mapping : typed에만 단독
 * @author tlawo
 *
 */
@Controller
@RequestMapping("/guestbook/*")
public class GuestbookController {
	
	
	// 밖에서 불려져야 하기 때문에 public이어야 한다.
	@ResponseBody // 화면 출력용 본래의 역할이 아니다.
	@RequestMapping
	public String list() {
		return "GuestbookController:list()";
	}
	
	@ResponseBody
	@RequestMapping
	public String add() {
		return "GuestbookController:add()";
	}
	
	@ResponseBody
	@RequestMapping
	public String delete() {
		
		return "GuestbookController:delete()";
	}
}
