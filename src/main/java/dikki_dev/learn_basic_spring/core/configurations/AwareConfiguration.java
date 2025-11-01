package dikki_dev.learn_basic_spring.core.configurations;

import dikki_dev.learn_basic_spring.core.services.AuthService;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@Import({AuthService.class})
public class AwareConfiguration {
}
