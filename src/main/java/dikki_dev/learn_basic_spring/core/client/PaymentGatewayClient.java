package dikki_dev.learn_basic_spring.core.client;

import lombok.Data;

// Asumsikan Class ini adalah Class dari Third Party, di mana kita tidak bisa mengubah struktur Class nya
// Kita bisa menggunakan "FactoryBean<T>" untuk membuat Bean nya dengan @Component Annotation
@Data
public class PaymentGatewayClient {
    private String endpoint;
    private String privateKey;
    private String publicKey;
}
