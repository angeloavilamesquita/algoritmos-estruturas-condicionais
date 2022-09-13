package estruturascondicionaiserepeticao;

import java.util.Scanner;

public class Problema05 {
    
    public static final int DIVISOR = 10;
        
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite a placa do carro: ");
        int licensePlate = read.nextInt();
        int lastDigit = licensePlate % DIVISOR;
        switch (lastDigit) {
            case 1, 2 -> System.out.println("Segunda");
            case 3, 4 -> System.out.println("Terça");
            case 5, 6 -> System.out.println("Quarta");
            case 7, 8 -> System.out.println("Quinta");
            default -> System.out.println("Sexta");
        }
        /*
        // switch normal
        switch (lastDigit) {
            case 1:
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
            case 4:
                System.out.println("Terça");
                break;
            case 5:
            case 6:
                System.out.println("Quarta");
                break;
            case 7:
            case 8:
                System.out.println("Quinta");
                break;
            default:
                System.out.println("Sexta");
        }
         */
    }
 
}
