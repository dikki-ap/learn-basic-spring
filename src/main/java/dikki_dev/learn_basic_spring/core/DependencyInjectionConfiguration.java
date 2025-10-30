package dikki_dev.learn_basic_spring.core;

import dikki_dev.learn_basic_spring.core.data.Bar;
import dikki_dev.learn_basic_spring.core.data.Foo;
import dikki_dev.learn_basic_spring.core.data.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyInjectionConfiguration {
    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    // Spring akan secara otomatis mencari "Bean" dengan tipe "Foo" dan "Bean" dengan tipe "Bar"
    public FooBar fooBar(Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }
}
