package dikki_dev.learn_basic_spring.core;

import dikki_dev.learn_basic_spring.core.configurations.EventListenerConfiguration;
import dikki_dev.learn_basic_spring.core.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventListenerTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void Setup(){
        applicationContext = new AnnotationConfigApplicationContext(EventListenerConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testLoginEventListener(){
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("dikki", "432");
        userService.login("dikki", "123");
        userService.login("eko", "432");
    }
}
