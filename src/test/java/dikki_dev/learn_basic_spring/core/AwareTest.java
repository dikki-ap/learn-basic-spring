package dikki_dev.learn_basic_spring.core;

import dikki_dev.learn_basic_spring.core.configurations.AwareConfiguration;
import dikki_dev.learn_basic_spring.core.services.AuthService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void Setup(){
        applicationContext = new AnnotationConfigApplicationContext(AwareConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testAwareInterface(){
        AuthService authService = applicationContext.getBean(AuthService.class);

        Assertions.assertNotNull(authService.getApplicationContext());
        Assertions.assertSame(authService.getApplicationContext(), applicationContext); // Harusnya appContext yang digunakan sama, karena sifatnya Singleton
    }
}
