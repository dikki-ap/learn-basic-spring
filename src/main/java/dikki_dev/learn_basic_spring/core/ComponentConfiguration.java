package dikki_dev.learn_basic_spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

// Membaca semua "@Component" Annotation yang ada di "package" dan "subpackage" nya
@ComponentScan(basePackages = {
        "dikki_dev.learn_basic_spring.core.services"
})
public class ComponentConfiguration {
}
