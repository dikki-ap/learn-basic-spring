package dikki_dev.learn_basic_spring.core.services;

import dikki_dev.learn_basic_spring.core.repositories.CustomerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Getter
    @Autowired // @Autowired Annotation juga digunakan untuk 'Field-Based' Dependency Injection, meskipun sudah tidak direkomendasikan oleh Spring
    // 'Constructor-Based' DI, 'Setter-Based' DI, dan 'Field-Based' DI dapat digabungkan semua sesuai kebutuhan
    private CustomerRepository customerRepository;
}
