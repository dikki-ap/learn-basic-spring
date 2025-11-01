package dikki_dev.learn_basic_spring.core.events;

import dikki_dev.learn_basic_spring.core.data.User;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

// Semua class yang extend "ApplicationEvent" akan menjadi Event, dan bisa di Listen sesuai dengan Listener nya
public class LoginSuccessEvent extends ApplicationEvent {

    @Getter
    private final User user;

    // Wajib membuat Constructor jika extends "ApplicationEvent"
    public LoginSuccessEvent(User user) {
        super(user);
        this.user = user;
    }
}
