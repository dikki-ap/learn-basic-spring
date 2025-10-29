package dikki_dev.learn_basic_spring.core;

import dikki_dev.learn_basic_spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanConfigurationTest {

    @Test
    void testCallBeanObject(){
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Assertions.assertNotNull(context);
    }

    // Jika Unit Test ini di disable, "Creating 'Foo' object' log juga akan terbuat meskipun tidak ada pemanggilan object
    @Test
    void testSingletonBeanObject()
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);

        // Memastikan foo1 dan foo2 adalah object yang sama karena bersifat Singleton
        Assertions.assertSame(foo1, foo2);
    }
}
