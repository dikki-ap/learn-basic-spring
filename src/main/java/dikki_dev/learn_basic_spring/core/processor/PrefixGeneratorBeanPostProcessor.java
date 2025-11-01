package dikki_dev.learn_basic_spring.core.processor;

import dikki_dev.learn_basic_spring.core.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class PrefixGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Prefix Generator Post Processor after Initializing Bean {}", beanName);
        if(bean instanceof IdAware){
            log.info("Set Prefix Id for Bean {}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId("Prefix-" + idAware.getId());
        }
        return bean;
    }


    // PrefixGenerator ini akan dieksekusi setelah IdGenerator
    @Override
    public int getOrder() {
        return 2;
    }
}
