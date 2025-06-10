import java.util.Scanner;
import Class.CustomsService;

public class Main {

    public static void main(String[] args) {

        System.out.println("Добро пожаловать в калькулятор таможенных пошлин! ");

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите цену товара: ");

        int x = sc.nextInt();

        System.out.print("Введите вес товара в киллограммах: ");

        int y = sc.nextInt();

        int tax =  CustomsService.calculateCustoms(x, y);

        System.out.print("Таможенная пошлина составляет: "+ tax + " рублей.");

    }

}