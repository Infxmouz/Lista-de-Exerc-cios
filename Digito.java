package digito;

import java.util.Scanner;

public class Digito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do cliente: R$ ");
        double salario = scanner.nextDouble();

        System.out.print("Digite a quantidade de pendências: ");
        int pendencias = scanner.nextInt();

        if (salario > 2500 && pendencias <= 2) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo não aprovado.");
        }
        scanner.close();
    }
    
}
