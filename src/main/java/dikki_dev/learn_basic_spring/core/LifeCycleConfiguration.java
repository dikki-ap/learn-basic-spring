package dikki_dev.learn_basic_spring.core;

import dikki_dev.learn_basic_spring.core.data.Connection;
import dikki_dev.learn_basic_spring.core.data.Server;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class LifeCycleConfiguration {

    // Spring akan secara otomatis detect Bean mana yang implementasi "InitializeBean" dan "DisposableBean" sesuai dengan LifeCycle nya
    @Bean
    public Connection connection(){
        return new Connection();
    }

    // Lebih simple menggunakan "initMethod" dan "destroyMethod" dari @Bean Annotation
    // @Bean(initMethod = "start", destroyMethod = "stop") // Tanpa implementasi "InitializeBean" dan "DisposableBean"
    @Bean // Tanpa "initMethod" dan "destroyMethod" otomatis membaca Annotation @PostConstruct dan @PreDestroy
    public Server server(){
        return new Server();
    }
}
