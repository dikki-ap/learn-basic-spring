package dikki_dev.learn_basic_spring.core.configurations;

import dikki_dev.learn_basic_spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfiguration {
    @Bean
    public Foo foo(){
        return new Foo();
    }
}
