package dikki_dev.learn_basic_spring.core;

import dikki_dev.learn_basic_spring.core.data.Connection;
import dikki_dev.learn_basic_spring.core.data.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {
    // Menggunakan "ConfigurableApplicationContext" agar bisa mengetes ".close()" function untuk menjalankan "destroy()" function dari "DisposableBean" Interface
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void SetUp() {
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        applicationContext.registerShutdownHook(); // Gunakan ini agar otomatis Shutdown setelahnya
    }

    @AfterEach
    void tearDown()
    {
        // applicationContext.close(); // Akan print log dari "DisposableBean" dengan method "destroy()"
    }

    @Test
    void testLifeCycleBean(){
        Connection connection = applicationContext.getBean(Connection.class); // Akan print log dari "InitializeBean" dengan method "afterPropertiesSet()"
    }

    @Test
    void testLifeCycleAnnotation(){
        Server server = applicationContext.getBean(Server.class); // Otomatis Start dan Stop
    }
}
