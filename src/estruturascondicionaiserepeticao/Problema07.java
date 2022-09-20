package estruturascondicionaiserepeticao;

import java.util.Scanner;

public class Problema07 {
    
    public static final int LIMIT = 0;
    public static final int DIVISOR = 10;
        
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int number = read.nextInt();
        while(number > LIMIT) {
            int rest = number % DIVISOR;
            number = number / DIVISOR;
            System.out.println(rest);
        }
    }
}
