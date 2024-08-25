package in.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class LoveForHerbsECommerceProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoveForHerbsECommerceProjectApplication.class, args);
		
		
		/*
		 * BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(); String
		 * newPassword = "newPassword123"; // Replace with your new password String
		 * hashedPassword = passwordEncoder.encode(newPassword);
		 * System.out.println(hashedPassword);
		 */
		 
	}

}
