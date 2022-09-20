package estruturascondicionaiserepeticao;

import java.util.Scanner;

public class Problema08 {
    
    public static final int LIMIT = 0;
        
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double number = LIMIT;
        do {
            System.out.print("Digite um numero nao negativo: ");
            number = read.nextDouble();
        } while(number <= LIMIT);
        double squareRoot = Math.sqrt(number);
        String message = "A raiz quadrada de %.2f eh %.2f \n";
        System.out.printf(message, number, squareRoot);
    }
}




