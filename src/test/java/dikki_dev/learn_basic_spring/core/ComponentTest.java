package dikki_dev.learn_basic_spring.core;

import dikki_dev.learn_basic_spring.core.repositories.ProductRepository;
import dikki_dev.learn_basic_spring.core.services.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void SetUp(){
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testService(){
        ProductService productService1 = applicationContext.getBean(ProductService.class);
        ProductService productService2 = applicationContext.getBean(ProductService.class);

        Assertions.assertSame(productService1, productService2);
    }

    @Test
    void testConstructorBasedDependencyInjection(){
        ProductService productService = applicationContext.getBean(ProductService.class);
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

        // Harusnya objectnya sama karena menggunakan "Constructor-Based" Dependency Injection
        Assertions.assertSame(productService.getProductRepository(), productRepository);
    }
}
