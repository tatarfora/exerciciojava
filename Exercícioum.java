import java.util.Scanner;

public class Exercícioum {
    public static void main(String[] args) {
        System.out.printf("Olá! ");

        Scanner objscan = new Scanner(System.in);
        System.out.printf("Digite seu nome:");
        String nome = objscan.next();
        System.out.println("Hello and welcome " + nome);

        }
}
