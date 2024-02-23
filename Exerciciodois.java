import java.util.Scanner;

public class Exerciciodois {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Double n;

        System.out.printf("Digite um numero:\n");
        n = ler.nextDouble();

        if (n > 0){
            System.out.println("O numero " + n + "é positivo ");
        } else if (n < 0){
            System.out.println("O numero " + n + "é negativo ");
        } else {
            System.out.println("O numero " + n + "é neutro ");
        }
    }
}
