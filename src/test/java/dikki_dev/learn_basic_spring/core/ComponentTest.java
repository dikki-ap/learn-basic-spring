package dikki_dev.learn_basic_spring.core;

import dikki_dev.learn_basic_spring.core.repositories.CategoryRepository;
import dikki_dev.learn_basic_spring.core.repositories.CustomerRepository;
import dikki_dev.learn_basic_spring.core.repositories.ProductRepository;
import dikki_dev.learn_basic_spring.core.services.CategoryService;
import dikki_dev.learn_basic_spring.core.services.CustomerService;
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

    @Test
    void testSetterBasedDependencyInjection(){
        CategoryService categoryService = applicationContext.getBean(CategoryService.class);
        CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);

        // Harusnya objectnya sama karena menggunakan "Setter-Based" Dependency Injection
        Assertions.assertSame(categoryService.getCategoryRepository(), categoryRepository);
    }

    @Test
    void testFieldBasedDependencyInjection(){
        CustomerService customerService = applicationContext.getBean(CustomerService.class);
        CustomerRepository customerRepository = applicationContext.getBean(CustomerRepository.class);

        // Harusnya objectnya sama karena menggunakan "Field-Based" Dependency Injection
        Assertions.assertSame(customerService.getCustomerRepository(), customerRepository);
    }
}
