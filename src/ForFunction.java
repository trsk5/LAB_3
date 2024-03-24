 import java.util.Scanner;

 public class ForFunction {
        public static double function2(double x) {
            return 0.25 * Math.pow(x, 3) + x - 1.2502;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть нижню межу: ");
            double lowerBound = scanner.nextDouble();
            System.out.print("Введіть верхню межу: ");
            double upperBound = scanner.nextDouble();

            int count = 0;

            for (int i = 0; i < 15; i++) {
                double x = 3 + i * 0.2;
                double value = function2(x);
                if (lowerBound <= value && value <= upperBound) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.println("Значень у заданому діапазоні не знайдено.");
            } else {
                System.out.println("Кількість значень у діапазоні: " + count);
            }
        }
    }

