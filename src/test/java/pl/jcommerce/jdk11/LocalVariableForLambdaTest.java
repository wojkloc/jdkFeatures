package pl.jcommerce.jdk11;

import com.google.common.base.Function;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotNull;


public class LocalVariableForLambdaTest {

    private Validator validator;

    @BeforeEach
    public void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    Function<String, String> append = (@NotNull var string) -> string + " World!";

    @Test
    public void varInLambdaTest() {
        System.out.println(append.apply("Hello"));

        System.out.println(append.apply(null));
    }

    @Test
    public void limitationsOfVarInLambda() {
        /*(var s1, s2) -> s1 + s2; //no skipping allowed
        (var s1, String y) -> s1 + y; //no mixing allowed

        var s1 -> s1; //not allowed. Need parentheses if you use var in lambda.*/
    }
}
