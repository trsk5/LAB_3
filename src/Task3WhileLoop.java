public class Task3WhileLoop {
    public static void main(String[] args) {
        System.out.println("Виведення годин та хвилин використовуючи цикл while:");
        int hour = 0;
        while (hour <= 2) {
            int min = 0;
            while (min < 60) {
                System.out.println(hour + " h " + min + " min");
                min++;
            }
            hour++;
        }
    }
}
