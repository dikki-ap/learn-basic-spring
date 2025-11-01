package dikki_dev.learn_basic_spring.core.listeners;

import dikki_dev.learn_basic_spring.core.events.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

// Semua class yang implement "ApplicationListener<T>" di mana T adalah class yang extend "ApplicationEvent"
// Yaitu class yang extend "ApplicationEvent" adalah "LoginSuccessEvent"
// Fungsinya adalah ketika ada suatu event dari "T" Event maka Listener bisa menangkap semua kejadian yang ada
@Slf4j
@Component
public class LoginSuccessListener implements ApplicationListener<LoginSuccessEvent> {
    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        log.info("Success login for user {}", event.getUser());
    }
}
