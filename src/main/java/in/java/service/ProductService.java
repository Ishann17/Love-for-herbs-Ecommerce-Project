package in.java.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.java.model.Product;
import in.java.repository.IProductRepository;

@Service
public class ProductService {
	
	@Autowired
	IProductRepository productRepository;
	
	public List<Product> getAllProduct(){
		return productRepository.findAll();
	}
	
	public void addProduct(Product product) {
		productRepository.save(product);
	}
	
	public void removeProductById(Long id) {
		productRepository.deleteById(id);
	}
	
	public Optional<Product> getProductById(long id){
		return productRepository.findById(id);
		
	}
	
	public List<Product> getAllProductByCategoryId(int id){
		return productRepository.findAllByCategory_Id(id);
	}
	
}
