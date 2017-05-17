package com.in28minutes.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.jee.LoginService;

@Controller
public class LoginController {

	private LoginService service = new LoginService();

	// ResponseBody--return directly instead of looking for url
	// @ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	// pass parameter in
	public String handleUserLogin(ModelMap model, @RequestParam String name,
			@RequestParam String password) {
		if (!service.validateUser(name, password)) {
			// put error message
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		model.put("name", name);
		return "welcome";
	}
}
