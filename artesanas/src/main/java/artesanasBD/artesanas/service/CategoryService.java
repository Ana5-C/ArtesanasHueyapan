package artesanasBD.artesanas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import artesanasBD.artesanas.model.Category;
import artesanasBD.artesanas.repository.CategoryRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll(){
        return categoryRepository.findAll();
    }

    public List<Category> getAll(int page, int pageSize) {
        PageRequest pageRequest = PageRequest.of(page, pageSize);
        Page<Category> categoryPage = categoryRepository.findAll(pageRequest);
        return categoryPage.getContent();
    }

    public void save(Category category){
        categoryRepository.save(category);
    }

    public Category getByIdCategory(Long idCategory){
        return categoryRepository.findById(idCategory).get();
    }

    public void delete(Long idCategory){
        categoryRepository.deleteById(idCategory);
    }

    public List<Category> getCategoryByName(String name){
        return categoryRepository.getCategoriesByNameJPQL(name);
    }
}
