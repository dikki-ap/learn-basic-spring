package dikki_dev.learn_basic_spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {

    @Test
    void testApplicationContext()
    {
        // Creating appContext using "Class" that using "@Configuration" Annotation
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringCoreConfiguration.class);

        Assertions.assertNotNull(context);
    }
}
