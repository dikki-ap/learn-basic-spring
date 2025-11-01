package dikki_dev.learn_basic_spring.core.services;

import lombok.Getter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/*
  Class ini mengimplementasi "ApplicationContextAware" dam "BeanNameAware", tidak perlu membuat manual BeanPostProcessor, karena harus override method "setXXX()"
  - ApplicationContextAware         : Mendapatkan ApplicationContext dari Bean
  - BeanFactoryAware                : Mendapatkan Bean Factory
  - BeanNameAware                   : Mendapatkan Nama Bean
  - ApplicationEventPublisherAware  : Mendapatkan Event Publisher
  - EnvironmentAware                : Mendapatkan Environtment
  etc

  Jadi kita tidak perlu lagi membuat BeanPostProcessor secara manual
 */
@Component
public class AuthService implements ApplicationContextAware, BeanNameAware {
    @Getter
    private String beanName;

    @Getter
    private ApplicationContext applicationContext;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
