package consumo;

import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância percorrida(em km): ");
        double quilometros = scanner.nextDouble();

        System.out.print("Digite a quantidade de combustível consumido(em litros): ");
        double litros = scanner.nextDouble();

        System.out.println("O consumo médio é" + (quilometros / litros) + "km/l");    

        scanner.close();
    }
    
}
