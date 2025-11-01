package dikki_dev.learn_basic_spring.core;

import dikki_dev.learn_basic_spring.core.application.FooApplication;
import dikki_dev.learn_basic_spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


// Tinggal menambahkan "@SpringBootTest (classes = Class)" untuk membuat UnitTest dari "@SpringBootApplication"
@SpringBootTest(classes = FooApplication.class)
public class FooApplicationTest {

    // Bisa menggunakan Dependency Injection dengan @Autowired
    // Seperti menggunakan 'Field-Based' DI
    // Disarankan tidak menggunakan "private" modifier agar diinjectnya tidak menggunaakn "Reflection"
    @Autowired
    Foo foo;

    @Test
    void testFoo(){
        Assertions.assertNotNull(foo);
    }
}
