package pl.jcommerce.jdk10;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class LocalVariableTypeInferenceTest {

    @Test
    public void whenVarInitWithString_thenGetStringTypeVar() {
        var message = "Hello, Java 10";
        assertTrue(message instanceof String);
        var list = new ArrayList<String>(); // infers ArrayList<String>
        var stream = list.stream();         // infers Stream<String>

        List<Object> objects = List.of(new Object()); // Pre Java 10
        var newObjects = List.of(new Object()); // Java 10 onwards
    }
}
