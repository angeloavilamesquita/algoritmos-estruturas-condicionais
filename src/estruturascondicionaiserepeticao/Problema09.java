package estruturascondicionaiserepeticao;

import java.util.Scanner;

public class Problema09 {
    
    public static final int BALANCE = 1000;
        
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double balance = BALANCE;
        int option = 0;
        double value = 0;
        do {
            System.out.println("*******************");
            System.out.println("Banco ADS 2022/2");
            System.out.println("1 - Deposito");
            System.out.println("2 - Saque");
            System.out.println("3 - Saldo");
            System.out.println("4 - Sair");
            System.out.println("*******************");
            System.out.println("Digite uma opcao: ");
            option = read.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.print("Digite o valor do deposito: ");
                    value = read.nextDouble();
                    balance += value;
                }
                case 2 -> {
                    System.out.print("Digite o valor do saque: ");
                    value = read.nextDouble();
                    balance -= value;
                }
                case 3 -> System.out.println("Saldo = " + balance);
                case 4 -> System.out.println("Saindo...");
                default -> System.out.println("Opcao invalida!");
            }
        } while (option != 4);
    }
}




