package dikki_dev.learn_basic_spring.core.services;

import org.springframework.stereotype.Component;

/*
    -- @Component Annotation --
    1. Spring akan otomatis membuat Bean berdasarkan nama Class menjadi camelCase, dalam contoh ini nama Bean nya adalah "productService"
    2. Hanya membuat 1 Bean per class, jika ingin membuat lebih dari 1 bisa menggunakan @Bean method dengan nama yang telah disesuaikan
    3. Bisa ditambahkan seperti @Lazy, @Scope dan yang lain lainnya yang berhubungan dengan @Bean
 */
@Component
public class ProductService {
}
