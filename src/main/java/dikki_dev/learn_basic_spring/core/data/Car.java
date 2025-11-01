package dikki_dev.learn_basic_spring.core.data;

import dikki_dev.learn_basic_spring.core.aware.IdAware;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class Car implements IdAware {

    @Getter
    private String id;

    // Meskipun "Car" Class override setId dari IdAware, nantinya Setter ini akan diabaikan oleh BeanPostProcessor
    // Akan mengutamakan yang ada di BeanPostProcessor
    @Override
    public void setId(String id) {
        this.id = id;
    }
}
