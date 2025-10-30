package dikki_dev.learn_basic_spring.core;

import dikki_dev.learn_basic_spring.core.data.Bar;
import dikki_dev.learn_basic_spring.core.data.Foo;
import dikki_dev.learn_basic_spring.core.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    void SetUp(){
        applicationContext =  new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
    }

    @Test
    void testWithDI(){

        ///  [TEST] Jika hanya ada 1 Bean dengan Tipe Data yang sama
        // Tidak perlu memikirkan dari object mana, hanya perlu mengambil dari Bean yang tersedia
        Foo foo = applicationContext.getBean(Foo.class); // Akan mengambil Primary Bean
        Foo foo2 = applicationContext.getBean("fooSecond", Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);
        FooBar fooBar = applicationContext.getBean(FooBar.class);

//        Assertions.assertSame(foo, fooBar.getFoo()); // Akan mengambil Specific Bean "fooSecond" karena menggunakan @Qualifier
        Assertions.assertSame(foo2, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }

    @Test
    void testWithoutDI(){
        var foo = new Foo();
        var bar = new Bar();

        FooBar fooBar = new FooBar(foo, bar); // Ini akan menjadi sangat komplek jika masing masing class "Foo" dan "Bar" memiliki ketergantungan yang lain

        Assertions.assertSame(foo, fooBar.getFoo()); // Harusnya object yang sama dengan getter getFoo()
        Assertions.assertSame(bar, fooBar.getBar()); // Harusnya object yang sama dengan getter getBar()
    }
}
