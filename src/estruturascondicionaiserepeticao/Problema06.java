package estruturascondicionaiserepeticao;

import java.util.Scanner;

public class Problema06 {
    
    public static final int LIMIT = 10;
        
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int number = read.nextInt();
        for (int counter = 1; counter <= LIMIT; counter++) {
            int result = number * counter;
            System.out.printf("%d x %d = %d \n", number, counter, result);
        }
    }
 
}
