package dikki_dev.learn_basic_spring.core.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

@Slf4j
public class ApplicationStartingListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        log.info("Application Starting...");
    }
}
