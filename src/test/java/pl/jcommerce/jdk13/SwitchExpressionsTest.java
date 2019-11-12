package pl.jcommerce.jdk13;

import org.junit.jupiter.api.Test;


public class SwitchExpressionsTest {

    static String executeOldSwitchExpression(String day) {
        String result = "";
        switch (day) {
            case "M":
            case "W":
            case "F":
                result = "MWF";
                break;
            case "T":
            case "TH":
            case "S":
                result = "TTS";
                break;
            default:
                result = (day.isEmpty()) ? "Please insert a valid day." : "Looks like a Sunday.";
        }
        return result;
    }

    /*private static String executeNew13SwitchExpression(String day){
        return switch (day){
            case "M", "W", "F": yield "MWF";
            case "T", "TH", "S": yield "TTS";
            default: yield (day.isEmpty()) ? "Please insert a valid day." : "Looks like a Sunday.";
        };
    }

    static String executeNew12SwitchExpression(String day) {
        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default -> (day.isEmpty()) ? "Please insert a valid day." : "Looks like a Sunday.";
        };
        return result;
    }

    @Test
    public void switchExpressionReview() {
        System.out.println("New Switch Expression result:");
        System.out.println(executeOldSwitchExpression("M"));
        System.out.println(executeOldSwitchExpression("TH"));
        System.out.println(executeOldSwitchExpression(""));
        System.out.println(executeOldSwitchExpression("SUN"));

        System.out.println(executeNew12SwitchExpression("M"));
        System.out.println(executeNew12SwitchExpression("TH"));
        System.out.println(executeNew12SwitchExpression(""));
        System.out.println(executeNew12SwitchExpression("SUN"));

        System.out.println(executeNew13SwitchExpression("M"));
        System.out.println(executeNew13SwitchExpression("TH"));
        System.out.println(executeNew13SwitchExpression(""));
        System.out.println(executeNew13SwitchExpression("SUN"));
    }*/
}
