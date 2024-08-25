package in.java.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import in.java.model.Role;

public interface IRoleRepository extends JpaRepository<Role, Integer> {

	
}
