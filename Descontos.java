package descontos;
import java.util.Scanner;

public class Descontos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.println("Digite o valor original do produto: R$ ");
         double valorOriginal = scanner.nextDouble();
         
         double desconto = valorOriginal * 0.10;
         double valorFinal = valorOriginal - desconto;
         
         System.out.printf("O valor final do produto é: %.2f%n", valorFinal);
         
         scanner.close();   
    }
    
}
