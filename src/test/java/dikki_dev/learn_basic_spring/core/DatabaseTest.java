package dikki_dev.learn_basic_spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

    @Test
    void testSingleton(){
        // Create a "SINGLETON" object
        var db1 = Database.getInstance();
        var db2 = Database.getInstance();

        // Will be the same object because "Singleton" design pattern
        // For default in Spring always create an object as Singleton
        Assertions.assertSame(db1, db2);
    }
}
