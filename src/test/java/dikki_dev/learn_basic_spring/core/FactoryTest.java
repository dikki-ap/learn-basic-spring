package dikki_dev.learn_basic_spring.core;

import dikki_dev.learn_basic_spring.core.client.PaymentGatewayClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void SetUp(){
        applicationContext = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testFactoryBean(){
        // Langsung menggunakan <T> nya tidak perlu menggunakan Class yang implement FactoryBean nya
        PaymentGatewayClient paymentGatewayClient = applicationContext.getBean(PaymentGatewayClient.class);

        Assertions.assertNotNull(paymentGatewayClient);
        Assertions.assertEquals("https://example.com", paymentGatewayClient.getEndpoint());
        Assertions.assertEquals("SECRET-KEY", paymentGatewayClient.getPrivateKey());
        Assertions.assertEquals("PUBLIC-KEY", paymentGatewayClient.getPublicKey());
    }
}
