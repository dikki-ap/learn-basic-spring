package dikki_dev.learn_basic_spring.core.application;

import dikki_dev.learn_basic_spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = FooApplication.class)
class FooApplicationTest {

    // Tinggal membuat Dependency Injection menggunakan @Autowired seperti 'Field-Based' DI

    // Disarankan tidak menggunakan "private" modifier, agar tidak diinject menggunakan "Reflection"
    @Autowired
    Foo foo;

    @Test
    void testSpringBoot(){
        Assertions.assertNotNull(foo);
    }
}