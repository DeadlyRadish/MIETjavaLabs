import java.util.Map;
import java.util.Scanner;

public class Controller {
    public static void startProgram(Scanner scanner) {
        int experiment_count = 0;
        while (true) {
            experiment_count++;
            View.println("Эксперимент - " + experiment_count);
            View.line();
            double user_input = getValidDoubleInput(scanner, "Введите число или '0' для завершения:");
            if (user_input == 0) {
                break;
            }
            runExperiment(user_input);
        }
    }

    public static void runExperiment(double number) {
        final double[] precisions  = {1.0, 0.1, 0.01, 0.001, 0.0001};
        View.println("Число | Точность | Время (Ньютон) | Время (Math.sqrt) | Результат (Ньютон) | Результат (Math.sqrt)");

        for (double precision : precisions) {
            double epsilon = number * precision / 100.0;

            Map<String, Double> newtonResult = Model.measureExecutionTimeNewton(number, epsilon);
            Map<String, Double> standardResult = Model.measureExecutionTimeStandard(number, epsilon);


            View.result(
                    number,
                    precision,
                    newtonResult.get("time"),
                    standardResult.get("time"),
                    newtonResult.get("result"),
                    standardResult.get("result")
            );
        }
    }

    public static double getValidDoubleInput(Scanner scanner, String prompt) {
        double number;
        while (true) {
            View.println(prompt);
            try {
                number = Double.parseDouble(scanner.nextLine());
                if (number < 0) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                View.println("Ошибка: введите положительное число.");
            }
        }
        return number;
    }
}
