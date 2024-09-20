public class View {
    public static <T> void println(T key) {
        System.out.println(key.toString());
    }

    public static <T> void print(T key) {
        System.out.print(key.toString());
    }

    public static void line() {
        for (int i = 0; i < 20; i++) {
            print("-");
        }
        println("");
    }

    public static void result(double number, double precision, double newtonTime, double mathSqrtTime, double newtonResult, double mathSqrtResult) {
        System.out.printf("%.2f | %.5f%% | %.0f нс | %.0f нс | %.5f | %.5f\n",
                number, precision, newtonTime, mathSqrtTime, newtonResult, mathSqrtResult);
    }
}
