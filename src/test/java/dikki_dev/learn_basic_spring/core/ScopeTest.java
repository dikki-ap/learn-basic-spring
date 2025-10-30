package dikki_dev.learn_basic_spring.core;

import dikki_dev.learn_basic_spring.core.data.Bar;
import dikki_dev.learn_basic_spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    void SetUp(){
        applicationContext = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
    }

    @Test
    void testScope(){
        Foo foo1 = applicationContext.getBean(Foo.class);
        Foo foo2 = applicationContext.getBean(Foo.class);
        Foo foo3 = applicationContext.getBean(Foo.class);

        // Semua object ini tidak akan sama, karena bersifat "prototype"
        Assertions.assertNotSame(foo1, foo2);
        Assertions.assertNotSame(foo1, foo3);
        Assertions.assertNotSame(foo3, foo2);
    }

    @Test
    void testDoubletonScope(){
        Bar bar1 = applicationContext.getBean(Bar.class);
        Bar bar2 = applicationContext.getBean(Bar.class);
        Bar bar3 = applicationContext.getBean(Bar.class);
        Bar bar4 = applicationContext.getBean(Bar.class);

        Assertions.assertNotSame(bar1, bar2); // bar1 != bar2
        Assertions.assertNotSame(bar3, bar4); // bar3 != bar4
        Assertions.assertSame(bar1, bar3); // bar1 == bar3
        Assertions.assertSame(bar2, bar4); // bar2 == bar4
    }
}
