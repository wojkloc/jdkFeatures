package pl.jcommerce.jdk12;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


public class StringMethodsTest {

    @Test
    public void indentReview() {
        String str = "*****\n  Hi\n  \tHello attendees\rHow are you?\nWould you like to make IT?\n*****";

        System.out.println(str.indent(0));
        System.out.println(str.indent(3));
        System.out.println(str.indent(-3));
    }

    @Test
    public void transformReview() {
        String s = "I,like,Java";
        List strList = s.transform(s1 -> {return Arrays.asList(s1.split(","));});
        System.out.println(strList);
    }
}
