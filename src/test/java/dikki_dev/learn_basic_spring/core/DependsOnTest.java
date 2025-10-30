package dikki_dev.learn_basic_spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    void SetUp(){
        applicationContext = new AnnotationConfigApplicationContext(DependsOnTest.class);
    }

    @Test
    void testDependsOn(){

    }
}
