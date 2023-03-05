package motocodepackages.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import motocodepackages.model.Users;
import motocodepackages.repository.UserRepository;

@RequestMapping("/users")
@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/list")
	public Iterable<Users> getAllUsers(){
		return userRepository.findAll();
	}
	
	@PostMapping("/add")
	public Users addUser (@RequestBody Users users) {
		return userRepository.save(users);
		
		
		
		
		
	}
	

}
