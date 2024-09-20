import java.util.HashMap;
import java.util.Map;

public class Model {
    public static double newtonSqrt(double number, double epsilon) {
        double guess = number / 2.0;
        while (Math.abs(guess * guess - number) > epsilon) {
            guess = (guess + number / guess) / 2.0;
        }
        return guess;
    }

    public static double standardSqrt(double number) {
        return Math.sqrt(number);
    }

    public static Map<String, Double> measureExecutionTimeNewton(double number, double epsilon) {
        long startTime = System.nanoTime();
        double result = newtonSqrt(number, epsilon);
        long endTime = System.nanoTime();
        double executionTime = endTime - startTime;

        Map<String, Double> resultMap = new HashMap<>();
        resultMap.put("result", result);
        resultMap.put("time", executionTime);

        return resultMap;
    }

    public static Map<String, Double> measureExecutionTimeStandard(double number, double epsilon) {
        long startTime = System.nanoTime();
        double result = standardSqrt(number);
        long endTime = System.nanoTime();
        double executionTime = endTime - startTime;

        Map<String, Double> resultMap = new HashMap<>();
        resultMap.put("result", result);
        resultMap.put("time", executionTime);

        return resultMap;
    }

}
