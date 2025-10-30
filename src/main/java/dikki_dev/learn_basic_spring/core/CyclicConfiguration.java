package dikki_dev.learn_basic_spring.core;

import dikki_dev.learn_basic_spring.core.data.CyclicA;
import dikki_dev.learn_basic_spring.core.data.CyclicB;
import dikki_dev.learn_basic_spring.core.data.CyclicC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CyclicConfiguration {

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB){
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC){
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA){
        return new CyclicC(cyclicA);
    }
}
