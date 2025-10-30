package dikki_dev.learn_basic_spring.core.services;

import dikki_dev.learn_basic_spring.core.repositories.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
    -- @Component Annotation --
    1. Spring akan otomatis membuat Bean berdasarkan nama Class menjadi camelCase, dalam contoh ini nama Bean nya adalah "productService"
    2. Hanya membuat 1 Bean per class, jika ingin membuat lebih dari 1 bisa menggunakan @Bean method dengan nama yang telah disesuaikan
    3. Bisa ditambahkan seperti @Lazy, @Scope dan yang lain lainnya yang berhubungan dengan @Bean
 */
@Component
public class ProductService {
    @Getter
    private ProductRepository productRepository;

    // Constructor-Based Dependency Injection
    // Spring akan membaca Constructor ini, DENGAN CATATAN HANYA CONSTRUCTOR DENGAN 1 PARAMETER SAJA
    @Autowired // Annotation ini digunakan untuk memberitahukan Spring agar menggunakan Constructor ini secara Default meskipun ada lebih dari 1 Constructor
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    // Constructor Ke-2
    public ProductService(ProductRepository productRepository, String name){
        this.productRepository = productRepository;
    }
}
