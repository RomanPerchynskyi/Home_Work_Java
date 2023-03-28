package basic.homeworks;
import java.util.Scanner;
public class homework2 {
    public static String getCombinedWord(String firstWord, String secondWord) {

        int halfLength = firstWord.length() / 2;
        String firstHalf = firstWord.substring(0, halfLength);
        String secondHalf = secondWord.substring(halfLength);
        return firstHalf + secondHalf;

    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое слово: ");
        String firstWord = scanner.next();
        System.out.print("Введите второе слово: ");
        String secondWord = scanner.next();

        String result = getCombinedWord(firstWord, secondWord);
        System.out.println("Сочетание слов: " + result);





        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double sum = add(num1, num2);
        double difference = subtract(num1, num2);
        double product = multiply(num1, num2);
        double quotient = divide(num1, num2);

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);





        double dollars = 88.0;
        double exchangeRate =0.85;
        double euro = convertToEuro(dollars, exchangeRate);
        System.out.println(dollars +"долларов = " + euro + "евро");



        int diametr1 = 24;
        int diametr2 = 28;
        int caloriesCm = 40;



        int area1 = calculateArea(diametr1);
        int area2 = calculateArea(diametr2);


        int caloriesDifference = calculateCalories(area2, area1, caloriesCm);

        System.out.println("Разница в калориях: " + caloriesDifference);
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double convertToEuro(double dollars, double exchangeRate) {
        return dollars * exchangeRate;
    }
    public static int calculateArea(int diametr){
        double radius = diametr / 2.0;
        double area = Math.PI * radius * radius;
        return (int) area;
    }


    public static int calculateCalories(int area2, int area1, int caloriesCm){
        int calories2 = area2 * caloriesCm;
        int calories1 = area1 * caloriesCm;
        int caloriesDifference = calories2 - calories1;
        return caloriesDifference;
    }
}

