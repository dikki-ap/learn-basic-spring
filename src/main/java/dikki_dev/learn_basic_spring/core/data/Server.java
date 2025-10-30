package dikki_dev.learn_basic_spring.core.data;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {
    public void start(){
        log.info("Start Server");
    }

    public void stop(){
        log.info("Stop Server");
    }

    @PostConstruct
    public void startWithAnnotation(){
        log.info("Start Server with @PostConstruct");
    }

    @PreDestroy
    public void stopWithAnnotation(){
        log.info("Stop Server with @PreDestroy");
    }
}
