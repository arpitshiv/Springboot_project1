package com.example.SpringProject.helloController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
@RequestMapping("say-hello")
@ResponseBody
public String sayHello() {
	return "hello guys khana khae";
}
}
