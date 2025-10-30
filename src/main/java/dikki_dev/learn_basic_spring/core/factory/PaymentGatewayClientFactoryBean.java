package dikki_dev.learn_basic_spring.core.factory;

import dikki_dev.learn_basic_spring.core.client.PaymentGatewayClient;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component(value = "PaymentGatewayClient")
public class PaymentGatewayClientFactoryBean implements FactoryBean<PaymentGatewayClient> {

    // Bisa menambahkan "Constructor-Based" / "Setter-Based" / "Field-Based" DI jika diperlukan

    // Wajib Override
    // Return value dari "getObject()" nya menjadi <T> yang digunakan di "implements" bukan object dari Class ini sendiri
    @Override
    public PaymentGatewayClient getObject() throws Exception {
        PaymentGatewayClient paymentGatewayClient = new PaymentGatewayClient();
        paymentGatewayClient.setEndpoint("https://example.com");
        paymentGatewayClient.setPrivateKey("SECRET-KEY");
        paymentGatewayClient.setPublicKey("PUBLIC-KEY");
        return paymentGatewayClient;
    }

    // Wajib Override
    @Override
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }
}
