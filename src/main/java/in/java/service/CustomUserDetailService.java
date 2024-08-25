package in.java.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import in.java.model.CustomUserDetail;
import in.java.model.User;
import in.java.repository.IUserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService {
	
	@Autowired
	IUserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		Optional<User> user = userRepository.findUserByEmail(email);
		user.orElseThrow(() -> new UsernameNotFoundException("No registered User not available with this email :: " + email));
		
		
		return user.map(CustomUserDetail::new).get();
	}

}
