package in.java.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.java.global.GlobalData;
import in.java.model.Role;
import in.java.model.User;
import in.java.repository.IRoleRepository;
import in.java.repository.IUserRepository;

@Controller
public class LoginController {
	
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	IUserRepository userRepository;
	
	@Autowired
	IRoleRepository roleRepository;
	
	@GetMapping("/login")
	public String login()
	{
		GlobalData.cart.clear();
		return "login";
	}
	
	
	@GetMapping("/register")
	public String getRegister() {
		return "register";
	}
	
	@PostMapping("/register")
	public String postRegister(@ModelAttribute("user") User user, HttpServletRequest request) throws ServletException {
		
		String password = user.getPassword();
		user.setPassword(bCryptPasswordEncoder.encode(password));
		List<Role> roles = new ArrayList<>();
		roles.add(roleRepository.findById(2).get());
		user.setRoles(roles);
		
		userRepository.save(user);
		
		request.login(user.getEmail(), password);
		
		return "redirect:/";
	}
	
	
}
