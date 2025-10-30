package dikki_dev.learn_basic_spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
// Import another "Configuration" using "value()" method from "@Bean" Annotation
@Import(value = {
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
}
