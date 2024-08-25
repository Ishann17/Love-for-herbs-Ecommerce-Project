package in.java.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.java.model.User;

public interface IUserRepository extends JpaRepository<User, Integer> {

		Optional<User> findUserByEmail(String email);
	
}
