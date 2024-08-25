package in.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.java.model.Category;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {

}
