package dikki_dev.learn_basic_spring.core.listeners;

import dikki_dev.learn_basic_spring.core.events.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LoginAgainSuccessListener implements ApplicationListener<LoginSuccessEvent> {
    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        log.info("Success login 'again' for user {}", event.getUser());
    }
}
