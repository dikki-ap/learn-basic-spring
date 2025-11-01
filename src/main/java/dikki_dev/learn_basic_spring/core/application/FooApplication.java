package dikki_dev.learn_basic_spring.core.application;

import dikki_dev.learn_basic_spring.core.data.Foo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/*
   "@SpringBootApplication" Annotation adalah annotation yang berfungsi untuk menandakan di mana aplikasi Spring boot kita
   - Dengan adanya Annotation ini, kita tidak perlu lagi membuat manual ApplicationContext dll
   - Semuanya akan diatur oleh Annotation tersebut
   - Hanya perlu membuat "main" function dan gunakan "SpringApplication.run(FooApplication.class, args)"
 */

@SpringBootApplication
public class FooApplication {

    // Membuat Bean lain yang ada di application Spring boot
    @Bean
    public Foo foo(){
        return new Foo();
    }


    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);

        Foo foo = applicationContext.getBean(Foo.class);
        System.out.println(foo);
    }
}
