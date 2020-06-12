/**
 * 
 */
package com.example.demo.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.LoginForm;
import com.example.demo.model.UserForm;

/**
 * @author DELL
 *
 */
@RestController
public class LoginController {
	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("login", "loginform", new LoginForm());
	}

	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("login", "loginform", new LoginForm());
	}

	@RequestMapping("/loginSub")
	public ModelAndView registerUser(@ModelAttribute("loginform") LoginForm loginForm) {

		String name = loginForm.getUsername();
		String pwd = loginForm.getPassword();

		if (name.equals("srini") && pwd.equals("123@srini")) {

			return new ModelAndView("success");
		}

		return new ModelAndView("redirect:/");

	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView showRegister() {
		ModelAndView mav = new ModelAndView("register");
		mav.addObject("user", new UserForm());
		return mav;
	}

	@RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute("user") UserForm user) {
		String name = user.getFirstname();
		if (name == null || name.equals("")) {
			return new ModelAndView("register", "user", new UserForm());
		}
		return new ModelAndView("welcome", "firstname", user.getFirstname());
	}
}
