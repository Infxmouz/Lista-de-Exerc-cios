package lanches;
import java.util.Scanner;

public class Lanches {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu de Lanches:");
        System.out.println("1 - Hamburguer (R$ 10,00)");
        System.out.println("2 - Cachorro-quente (R$ 8,00)");
        System.out.println("3 - Batata Frita (R$ 5,00)");
        System.out.print("Escolha o número do lanche: ");
        
        int escolha = scanner.nextInt();

        String lanche = "";
        double preco = 0.0;

        switch (escolha) {
            case 1:
                lanche = "Hamburguer";
                preco = 10.00;
                break;
            case 2:
                lanche = "Cachorro-quente";
                preco = 8.00;
                break;
            case 3:
                lanche = "Batata Frita";
                preco = 5.00;
                break;
            default:
                System.out.println("Opção inválida.");
                scanner.close();
                return; 
        }
        System.out.printf("Você escolheu: %s - Preço: R$ %.2f%n", lanche, preco);
        scanner.close();
    }
    
}
