package dikki_dev.learn_basic_spring.core.configurations;

import dikki_dev.learn_basic_spring.core.listeners.LoginAgainSuccessListener;
import dikki_dev.learn_basic_spring.core.listeners.LoginSuccessListener;
import dikki_dev.learn_basic_spring.core.listeners.UserListener;
import dikki_dev.learn_basic_spring.core.services.UserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({UserService.class, LoginSuccessListener.class, LoginAgainSuccessListener.class, UserListener.class})
public class EventListenerConfiguration {
}
