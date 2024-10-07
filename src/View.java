public class View {
    public static <T> void println(T promt) {
        System.out.println(promt.toString());
    }

    public static void viewLine(){
        for (int i = 0; i < 25; i++) {
            System.out.print('-');
        }
        System.out.println();
    }

    public static void viewMainMenu(){
        println("Перейти к базе данных-----------------1");
        println("Перейти в систему запуска-------------2");
        println("Выйти из программы--------------------3");
    }

    public static void viewBDMenu(){
        println("Выбрать дрон по номеру-------------------1");
        println("Добавить новый дрон----------------------2");
        println("Выход из базы данных---------------------3");
    }

    public static void viewDroneShortInfo(int index, String name, String brand){
        System.out.printf("%02d| %-30s | %-30s\n",
                index, name, brand);
    }


}
