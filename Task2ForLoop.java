public class Task2ForLoop {
    public static void main(String[] args) {
        System.out.println("Виведення годин та хвилин використовуючи цикл for:");
        for (int hour = 0; hour <= 2; hour++) {
            for (int min = 0; min < 60; min++) {
                System.out.println(hour + " h " + min + " min");
            }
        }
    }
}
