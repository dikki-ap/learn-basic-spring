package dikki_dev.learn_basic_spring.core.processor;

import dikki_dev.learn_basic_spring.core.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class IdGeneratorBeanPostProcessor implements BeanPostProcessor {

    // Ada banyak method dari "BeanPostProcessor" salah satunya adalah "postProcessAfterInitialization()"
    // Method ini berfungsi untuk melakukan suatu hal setelah initiate Bean oleh Spring
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Post Processor after Initializing Bean {}", beanName);
        if(bean instanceof IdAware){
            log.info("Set Id for Bean {}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId(UUID.randomUUID().toString());
        }
        return bean;
    }
}
