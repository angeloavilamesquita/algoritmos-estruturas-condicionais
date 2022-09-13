package estruturascondicionaiserepeticao;

import java.util.Scanner;

public class Problema04 {
    
    public static final int ZERO = 0;
        
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double number = read.nextDouble();
        if (number > ZERO) {
            System.out.println("Positivo");
        } else {
            if (number < ZERO) {
                System.out.println("Negativo");
            } else {
                System.out.println("Nulo");
            }
        }
    }
 
}
