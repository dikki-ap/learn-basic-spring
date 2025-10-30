package dikki_dev.learn_basic_spring.core;

import dikki_dev.learn_basic_spring.core.configurations.FooConfiguration;
import dikki_dev.learn_basic_spring.core.configurations.subconfigurations.BarConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
// Import another "Configuration" using "value()" method from "@Bean" Annotation
//@Import(value = {
//        FooConfiguration.class,
//        BarConfiguration.class
//})

// Import all classes with "@Configuration" Annotation in "package" and "subpackage"
@ComponentScan(basePackages = {
        "dikki_dev.learn_basic_spring.core.configurations"
})
public class MainConfiguration {
}
