package dikki_dev.learn_basic_spring.core.services;

import dikki_dev.learn_basic_spring.core.repositories.CategoryRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoryService {

    @Getter
    private CategoryRepository categoryRepository;

    // @Autowired Annotation ini digunakan khusus "Setter" agar Spring bisa mendeteksi Dependency Injection untuk Class yang tidak memiliki Constructor
    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }
}
