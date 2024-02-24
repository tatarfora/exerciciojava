import java.util.Scanner;

public class Exerciciocinco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em °C:");
        double Celcius = scanner.nextDouble();
        double Fahrenheit = (Celcius * 9 / 5) + 32;
        System.out.println("A temperatura em °F:" + Fahrenheit);
        scanner.close();

    }
}
