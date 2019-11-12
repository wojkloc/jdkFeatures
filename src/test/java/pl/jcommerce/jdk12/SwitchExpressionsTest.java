package pl.jcommerce.jdk12;

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

    /*static String executeNewSwitchExpression(String day) {
        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default -> {
                if (day.isEmpty())
                    break "Please insert a valid day.";
                else
                    break "Looks like a Sunday.";
            }
        };
        return result;
    }*/

    @Test
    public void switchExpressionReview() {
        System.out.println("New Switch Expression result:");
        System.out.println(executeOldSwitchExpression("M"));
        System.out.println(executeOldSwitchExpression("TH"));
        System.out.println(executeOldSwitchExpression(""));
        System.out.println(executeOldSwitchExpression("SUN"));

        /*System.out.println(executeNewSwitchExpression("M"));
        System.out.println(executeNewSwitchExpression("TH"));
        System.out.println(executeNewSwitchExpression(""));
        System.out.println(executeNewSwitchExpression("SUN"));*/
    }
}
