package dikki_dev.learn_basic_spring.core;

import dikki_dev.learn_basic_spring.core.data.Bar;
import dikki_dev.learn_basic_spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.*;

@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Lazy // Menambahkan "@Lazy" Annotation, agar Bean ini dibuat saat dipanggil saja, bisa menambah performance saat Spring pertama kali dijalankan
    @Bean
    @DependsOn({"bar"}) // Menggunakan "@DependsOn" Annotation, agar "bar" Bean  dibuat terlebih daripada "foo" Bean
    // Normalnya pembuatan "Bean" itu secara acak atau dari atas ke bawah
    public Foo foo(){
        log.info("Creating new 'foo' object");
        return new Foo();
    }

    @Bean
    public Bar bar(){
        log.info("Creating new 'bar' object");
        return new Bar();
    }
}
