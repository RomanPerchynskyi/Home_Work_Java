package basiс.homeworks;
import java.util.Scanner;
public class homework1 {
    public static void main(String[] args) {
        int a = 54;
        int b = 16;
        System.out.println(a + b);
        int c = 50;
        int d = 3;
        int result = c / d;
        System.out.println(result);
        System.out.println(-5+8*6);
        System.out.println((55 + 9) % 9);



        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        System.out.println(n * n);


        int num1 = 0, num2 = 1, num3 = 2, num4 = 3, num5 = 4, num6 = 5, num7 = 6, num8 = 7, num9 = 8, num10 = 9;
        int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        double average = (double) sum / 10;
        System.out.println("Среднее арифметическое: " + average);

         double PRICE_A = 1000.0;
         double PRICE_B = 500.0;
         double DISCOUNT = 100.0;

        double total = PRICE_A + PRICE_B - DISCOUNT;
        double discountPercent = (DISCOUNT / (PRICE_A + PRICE_B)) * 100.0;

        System.out.println("Сумма покупки со скидкой: " + total );
        System.out.println("Процент скидки: " + discountPercent + "%");
    }


}
