package dikki_dev.learn_basic_spring.core.listeners;

import dikki_dev.learn_basic_spring.core.events.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserListener {
    // Manfaat menggunakan "@EventListener" Annotation ini lebih simple, DAN 1 BEAN BISA MEMILIKI BANYAK LISTENER

    @EventListener(classes = LoginSuccessEvent.class)
    public void onApplicationEvent(LoginSuccessEvent event) {
        log.info("Success login for user {}", event.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onApplicationEvent2(LoginSuccessEvent event) {
        log.info("Success login-2 for user {}", event.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onApplicationEvent3(LoginSuccessEvent event) {
        log.info("Success login-3 for user {}", event.getUser());
    }
}
