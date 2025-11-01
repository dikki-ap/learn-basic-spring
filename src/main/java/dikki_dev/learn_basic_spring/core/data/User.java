package dikki_dev.learn_basic_spring.core.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class User {
    @Getter
    private String username;
}
