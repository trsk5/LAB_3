 import java.util.Scanner;

 public class WhileFunction {
        public static double function2(double x) {
            return 0.25 * Math.pow(x, 3) + x - 1.2502;
        }

        public static void main(String[] args) {
            double x = 3.0;  // Початкова точка інтервалу
            double end = 6.0;  // Кінцева точка інтервалу
            double step = 0.2;  // Крок

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть нижню межу: ");
            double lowerBound = scanner.nextDouble();
            System.out.print("Введіть верхню межу: ");
            double upperBound = scanner.nextDouble();

            int count = 0;

            while (x <= end) {
                double value = function2(x);
                if (lowerBound <= value && value <= upperBound) {
                    count++;
                }
                x += step;
            }

            if (count == 0) {
                System.out.println("Значень у заданому діапазоні не знайдено.");
            } else {
                System.out.println("Кількість значень у діапазоні: " + count);
            }
        }
    }

