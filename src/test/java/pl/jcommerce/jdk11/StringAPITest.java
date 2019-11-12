package pl.jcommerce.jdk11;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StringAPITest {

    @Test
    public void checkNewStringApi() {
        var repeat = "ABC".repeat(3);
        System.out.println(repeat);

        var whitespaces = "    some text        \n";
        System.out.println(whitespaces.stripLeading());
        System.out.println(whitespaces.stripTrailing());
        System.out.println(whitespaces.strip());
    }

    @Test
    public void testIsBlank() {
        System.out.println("  ".isEmpty());
        System.out.println("".isBlank());

        var s = "JCommerce";
        System.out.println(s.isBlank());
    }

    @Test
    public void testLines() {
        var str = "JC\nJC\nJC";

        System.out.println(str);
        System.out.println(str.lines().collect(Collectors.toList()));
    }

    @Test
    public void testPredicates() {
        var chracterPredicate = Pattern.compile("ep").asPredicate();
        Stream.of("coding","testing","deploying")
            .filter(chracterPredicate)
            .forEach(System.out::println);

        var chracterAsMatchPredicate = Pattern.compile("deploying").asPredicate();
        Stream.of("coding","testing","deploying")
                .filter(chracterAsMatchPredicate)
                .forEach(System.out::println);

        final String EMAIL_PATTERN = "^[a-zA-Z0-9#_~!$&'()*+,;=:.\"<>@\\[\\]\\\\]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*$";

        var emailPattern = Pattern.compile(EMAIL_PATTERN).asMatchPredicate();
        Stream.of("jondoe@gmail.com")
                .filter(emailPattern)
                .forEach(System.out::println);
    }
}
