package in.java.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.java.model.Category;
import in.java.repository.ICategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	ICategoryRepository categoryRepository;
	
	public List<Category> getCategory(){
		return categoryRepository.findAll();
	}
	
	public void addCategory(Category category) {
		 categoryRepository.save(category);
	}
	
	public void removeCategoryById(int id) {
		categoryRepository.deleteById(id);
	}
	
	public Optional<Category> getCategoryById(int id){
		return categoryRepository.findById(id);
	}
}
