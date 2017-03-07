package be.ordina.prestige.service;

import be.ordina.prestige.model.Category;
import be.ordina.prestige.repo.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SaFu on 6/03/2017.
 */
@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category createCategory(String name) {
        return categoryRepository.save(new Category(name));
    }
}
