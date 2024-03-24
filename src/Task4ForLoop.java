public class Task4ForLoop {
    public static void main(String[] args) {
        System.out.println("Виведення годин, хвилин та секунд використовуючи цикл for:");
        for (int h = 0; h <= 2; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    System.out.println(h + " h " + m + " min " + s + " sec");
                }
            }
        }
    }
}
