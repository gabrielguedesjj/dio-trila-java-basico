import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua agência ");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite a sua agência ");
        String agencia = sc.next();

        System.out.println("Titular da conta:");
        String titular = sc.next();

        System.out.println("Digite seu saldo");
        double saldo = sc.nextDouble();

        System.out.printf("Olá " + titular + ", obrigado por criar uma conta em nosso banco, sua agência é: " +agencia + ", conta " + numero + " e seu saldo já está disponivel R$ %.2f%n", saldo);

    }
}
