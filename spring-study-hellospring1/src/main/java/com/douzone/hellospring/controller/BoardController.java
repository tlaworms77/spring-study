package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@ResponseBody // 디버깅 용
	@RequestMapping("/write")
	// @RequestParam("name") ==> name이라는 이름으로 parameter가 들어오면 여기에 setting을 해달라는 의미!!
	// 하지만 파라미터를 안주면 에러가 나온다.
	// --> @RequestParam("name") ==> @RequestParam(value="name", required=false)
	public String write(@RequestParam(value="name", required=false) String name) {
		return "BoardController:write()" + name;
	}
	
	
	@ResponseBody // 디버깅 용
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="no", required=false) Long no) {
		return "BoardController:delete()" + no;
	}
	
	// 추천하는 방식!!!!!!!!!!!
	@ResponseBody
	@RequestMapping("/deleteform")
	public String deleteform(
		@RequestParam("e") String email, // 값을 안주면 에러가 나기때문에 밑처럼 설정필요 ( 레퍼타입과 같은 객체로 )
		@RequestParam(value="name", required=false) String name,
		@RequestParam String password, 
 /*추천*/@RequestParam(value="content", required=true, defaultValue="") String content) {
		
		System.out.println("email: " + email);
		System.out.println("name: " + name);
		System.out.println("password: " + password);
		System.out.println("content: " + content);
		return "BoardController:deleteform()";
	}
	
	// Tip !!
	@ResponseBody
	@RequestMapping("/view")
	public String view( // defaultvalue => String 값
		@RequestParam(value="no", required=true, defaultValue="0") Long no) {
		System.out.println("no: " + no);
		return "BoardController:view()";
	}
	
	@ResponseBody
	@RequestMapping("/view2/{no}") //{no}: pathVariable
	public String view2( // defaultvalue => String 값
		@PathVariable("no") Long no) {
		System.out.println("no: " + no);
		return "BoardController:view2()";
	}
	
	@ResponseBody
	@RequestMapping("/view3/{id}/{no}") //{no}: pathVariable
	public String view3( // defaultvalue => String 값
		@PathVariable("id") Long id,
		@PathVariable("no") Long no) {
		
		System.out.println("id: " + id);
		System.out.println("no: " + no);
		return "BoardController:view3()";
	}
	
}
