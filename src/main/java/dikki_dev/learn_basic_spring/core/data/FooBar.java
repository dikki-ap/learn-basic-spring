package dikki_dev.learn_basic_spring.core.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data // Using @Data Annotation from Lombok to generate all Setter & Getter
public class FooBar {
    private Foo foo;
    private Bar bar;
}
