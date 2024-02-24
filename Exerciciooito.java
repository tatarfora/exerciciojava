import java.util.Scanner;
public class Exerciciooito {

    public static void main(String[] args) {

        System.out.printf("Calculadora de Fatorial. ");

        Scanner objscan = new Scanner(System.in);
        System.out.printf(" Digite o número do qual deseja o fatorial: ");
        Integer fatorial = objscan.nextInt();

        if (fatorial < 0 ) {
            System.out.printf(" Não existe fatorial de números negativos. ");
        }

        int i, fact=1;
        int numero = fatorial;

        for(i=1; i<=numero; i++){
            fact=fact*i;
        }
        System.out.println("Factorial of " + numero +" is: "+ fact + ". Obrigada por utilizar nossa calculadora. ");

    }
}