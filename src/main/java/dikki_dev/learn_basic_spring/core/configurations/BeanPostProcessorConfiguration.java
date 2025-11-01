package dikki_dev.learn_basic_spring.core.configurations;

import dikki_dev.learn_basic_spring.core.data.Car;
import dikki_dev.learn_basic_spring.core.processor.IdGeneratorBeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// Membuat BeanPostProcessor Configuration dan Import @Component yang diperlukan
// Bisa menggunakan @ComponentScan juga kalau mau
@Configuration
@Import({Car.class, IdGeneratorBeanPostProcessor.class})
public class BeanPostProcessorConfiguration {
}
