import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2, soma;

        System.out.print("Digite o primeiro número: ");
        num1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = teclado.nextInt();

        soma = num1 + num2;

        System.out.println("A soma é: " + soma);

        teclado.close();
    }
}