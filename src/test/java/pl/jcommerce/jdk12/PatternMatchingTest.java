package pl.jcommerce.jdk12;

import org.junit.jupiter.api.Test;


public class PatternMatchingTest {

    @Test
    public void patternMatchingFoInstanceOfReview() {

        Object obj = "Hello";
        if (obj instanceof String) {  // <--- JDK <= 11
            String s = (String) obj;
            // use s in your code from here
            System.out.println(s);
        }

        /*if (obj instanceof String str) {  // <--- JDK >= 12
            // can use s directly here
            System.out.println(str);
        }*/
    }
}
