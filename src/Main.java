import java.util.Scanner;
import Class.CustomsService;

public class Main {

    public static void main(String[] args) {

        System.out.println("Добро пожаловать в калькулятор таможенных пошлин! ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цену товара: ");

        int cost = scanner.nextInt();

        System.out.print("Введите вес товара в киллограммах: ");

        int weight = scanner.nextInt();

        int tax =  CustomsService.calculateCustoms(cost, weight);

        System.out.print("Таможенная пошлина составляет: "+ tax + " рублей.");


    }

}