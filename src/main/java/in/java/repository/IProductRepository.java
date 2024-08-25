package in.java.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.java.model.Product;

public interface IProductRepository extends JpaRepository<Product, Long>{
	
	List<Product> findAllByCategory_Id(int id);
}
