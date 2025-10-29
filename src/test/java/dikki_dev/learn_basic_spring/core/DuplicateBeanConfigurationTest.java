package dikki_dev.learn_basic_spring.core;

import dikki_dev.learn_basic_spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicateBeanConfigurationTest {

    @Test
    void testDuplicateBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);

        // Get no unique Bean (Throws NoUniqueBeanDefinitionException)
        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Foo fooObject = context.getBean(Foo.class);
        });

        // Failed Scenario (Throw "NoUniqueBeanDefinitionException)
//        Assertions.assertNotNull(context.getBean(Foo.class));
    }

    @Test
    void testGetEachBen(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);

        // Menggunakan "nama Bean" jika ada lebih dari
        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        Assertions.assertSame(foo1, foo2);
    }

    @Test
    void testGetNonExistBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);

        // Get non exist Bean (Throws NoSuchBeanDefinitionException)
        Assertions.assertThrows(NoSuchBeanDefinitionException.class, () -> {
            Foo foo3 = context.getBean("foo3", Foo.class);
        });
    }
}
