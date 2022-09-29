package jinn.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class boardController {

	@GetMapping("/board")
	public String join() {
		return "board/list";
	}
	
	@GetMapping("/board")
	public String login() {
		return "board/view";
	}
	
	@GetMapping("/board")
	public String myinfo() {
		return "board/write";
	}
	
}