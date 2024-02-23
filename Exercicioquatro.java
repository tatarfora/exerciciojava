import java.util.Scanner;

public class Exercicioseis {

        public static void main(String[] args) {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.
            System.out.printf("Verificador de maioridade etária. ");

            Scanner objscan = new Scanner(System.in);
            System.out.printf(" Digite sua idade:");
            Integer idade = objscan.nextInt();
            if (idade < 18) {
                System.out.printf("Usuário menor de idade. ");
            } else if (idade >= 18 && idade < 120) {
                System.out.printf("Usuário maior de idade. ");
            } else {
                System.out.printf("Idade Inválida, tente novamente mais tarde. ");
            }
            System.out.println("Obrigada por utilizar nosso verificador. ");

        }
}
