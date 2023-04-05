package basic.homeworks;
import java.util.Scanner;
public class homework4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название фигуры (треугольник, круг, прямоугольник): ");
        String figureName = scanner.nextLine().toLowerCase();
        checkfigure(figureName);
    }

    private static void checkfigure(String figureName) {
        if (figureName.equals("треугольник")) {
            triangle();
        } else if (figureName.equals("круг")) {
            circle();
        } else if (figureName.equals("прямоугольник")) {
            rectangle();
        } else {
            System.out.println("Неизвестное название фигуры!");
        }
    }

    private static void triangle() {
        Scanner scanner = new Scanner(System.in);
        double a = readDouble("Введите длину стороны a: ", scanner);
        double b = readDouble("Введите длину стороны b: ", scanner);
        double c = readDouble("Введите длину стороны c: ", scanner);
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("Площадь треугольника: %.2f", area);
    }

    private static void rectangle() {
        Scanner scanner = new Scanner(System.in);
        double a = readDouble("Введите длину стороны a: ", scanner);
        double b = readDouble("Введите длину стороны b: ", scanner);
        double area = a * b;
        System.out.printf("Площадь прямоугольника: %.2f", area);
    }

    private static void circle() {
        Scanner scanner = new Scanner(System.in);
        double r = readDouble("Введите радиус: ", scanner);
        double area = Math.PI * r * r;
        System.out.printf("Площадь круга: %.2f", area);
    }

    private static double readDouble(String message, Scanner scanner) {
        double value;
        while (true) {
            System.out.print(message);
            try {
                value = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат числа! Попробуйте еще раз.");
            }
        }

        return value;
    }
}

