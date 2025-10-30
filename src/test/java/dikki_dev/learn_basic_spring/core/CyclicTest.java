package dikki_dev.learn_basic_spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyclicTest {

    @Test
    void testCircularDependencies(){
        Assertions.assertThrows(Throwable.class, () -> {
            // Throws Exception "UnsatisfiedDependencyException"
            ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CyclicConfiguration.class);
        });
    }
}
