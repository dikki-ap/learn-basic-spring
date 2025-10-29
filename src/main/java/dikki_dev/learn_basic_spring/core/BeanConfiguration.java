package dikki_dev.learn_basic_spring.core;

import dikki_dev.learn_basic_spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BeanConfiguration {

    /*
    -- Membuat Bean --
    - Bean adalah suatu object yang dimasukkan ke dalam container IoC Spring.
    - Defaultnya bersifat "Singleton"

    1. Akan membaca Annotation "@Configuration" dan membaca semua Annotation "@Bean" di method yang ada di dalam classnya
    2. Nama Beannya biasanya sesuai dengan nama methodnya.
    3. Bersifat Singleton.
    4. Akan dipanggil atau dijalankan meskipun objectnya belum dibuat
     */

    @Bean
    public Foo foo(){
        log.info("Creating 'Foo' object"); // Ini akan dipanggil saat runtime, meskipun objectnya tidak dipanggil di manapun.
        return new Foo();
    }
}
