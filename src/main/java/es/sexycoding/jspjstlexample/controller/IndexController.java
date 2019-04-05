package es.sexycoding.jspjstlexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/index")
	public String getView(Model model) {
		String message = "Hello there, this is a message";
        model.addAttribute("msg", message);
        return "index";
    }
}
