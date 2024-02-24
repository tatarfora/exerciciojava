import java.util.Scanner;
import java.util.Random;

class Exercicioseis {

    public static void main(String[] args) {

        Random random = new Random();

        int valor = random.nextInt(6);

        System.out.println("O número aleatório gerado é: " + (valor+1));

    }
}