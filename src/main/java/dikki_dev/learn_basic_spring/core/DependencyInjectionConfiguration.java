package dikki_dev.learn_basic_spring.core;

import dikki_dev.learn_basic_spring.core.data.Bar;
import dikki_dev.learn_basic_spring.core.data.Foo;
import dikki_dev.learn_basic_spring.core.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DependencyInjectionConfiguration {
    @Primary
    @Bean("fooFirst")
    public Foo fooFirst(){
        return new Foo();
    }

    @Bean("fooSecond")
    public Foo fooSecond(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    // Spring akan secara otomatis mencari "Bean" dengan tipe "Foo" dan "Bean" dengan tipe "Bar"
    public FooBar fooBar(@Qualifier("fooSecond")Foo foo, Bar bar){ // Menggunakan "@Qualifier" Annotation untum nenentukan bahwa menggunakan specific Bean
        return new FooBar(foo, bar);
    }
}
