package dikki_dev.learn_basic_spring.core;

import dikki_dev.learn_basic_spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class ScopeConfiguration {
    /*
    -- Jenis Scope di Spring --
    1. singleton:   Defaultm hanya sekali dibuat dalam Spring IoC.
    2. prototype:   Selalu dibuat object baru ketika Bean diakses.
    3. request:     Dibuat per HTTP Request (Khusus untuk Web App).
    4. session:     Dibuat per HTTP Session (Khusus untuk Web App).
    5. application: Dibuat per ServletContext (Khusus untuk Web App).
    6. websocket:   Dibuat per WebSocket (Khusus untuk WebSocket App).
     */
    @Bean
    @Scope("prototype")
    public Foo foo(){
        log.info("Creating new 'Foo' object");
        return new Foo();
    }
}
