package estruturascondicionaiserepeticao;

import java.util.Scanner;

/**
 *
 * 
 */
public class Problema01 {
    
    public static final int REFERENCIA = 30;
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o peso (em kgs): ");
        double weight = read.nextDouble();
        System.out.print("Digite a altura (em metros): ");
        double height = read.nextDouble();
        double imc = weight / Math.pow(height, 2);
        System.out.println("o IMC eh: " + imc);
        if (imc <= REFERENCIA) {
            System.out.println("Normal");
        } else {
            System.out.println("Sobrepeso");
        }
    }
 
}
