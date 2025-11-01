package dikki_dev.learn_basic_spring.core;

import dikki_dev.learn_basic_spring.core.configurations.BeanPostProcessorConfiguration;
import dikki_dev.learn_basic_spring.core.data.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanPostProcessorTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void Setup(){
        applicationContext = new AnnotationConfigApplicationContext(BeanPostProcessorConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testGenerateUUID(){
        Car car = applicationContext.getBean(Car.class);
        System.out.println(car.getId());

        // Harusnya Id dari Car sudah menjadi UUID meskipun tidak pernah diset secara manual
        // UUID ini berasal dari BeanPostProcessor
        Assertions.assertNotNull(car.getId());
    }

    @Test
    void testPrefixGenerator(){
        Car car = applicationContext.getBean(Car.class);
        Assertions.assertNotNull(car.getId());
        Assertions.assertTrue(car.getId().startsWith("Prefix-"));
    }
}
