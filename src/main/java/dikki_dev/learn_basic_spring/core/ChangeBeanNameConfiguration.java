package dikki_dev.learn_basic_spring.core;

import dikki_dev.learn_basic_spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Slf4j
@Configuration
public class ChangeBeanNameConfiguration {
    /*
    - Jika ada Bean yang memiliki tipe data yang sama contohnya "Foo", maka nama Bean / methodnya harus berbeda

    1. Nama Bean / method bersifat UNIQUE
     */

    @Primary // Set foo1 menjadi "Primary Bean" menggunakan Annotation "@Primary" sebagai default Bean
    @Bean(value = "fooFirst") // Mengubah nama Bean menggunakan "value" method dari @Bean Annotation
    public Foo foo1(){
        log.info("Creating 'Foo 1' object"); // Ini akan dipanggil saat runtime, meskipun objectnya tidak dipanggil di manapun.
        return new Foo();
    }
    @Bean(value = "fooSecond") // Mengubah nama Bean menggunakan "value" method dari @Bean Annotation
    public Foo foo2(){
        log.info("Creating 'Foo 2' object"); // Ini akan dipanggil saat runtime, meskipun objectnya tidak dipanggil di manapun.
        return new Foo();
    }

}
