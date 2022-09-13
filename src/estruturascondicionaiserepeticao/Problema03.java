package estruturascondicionaiserepeticao;

import java.util.Scanner;

public class Problema03 {
    
    public static final int LIMIT_OF_ABSENCE = 45;
    public static final double GRADE_AVERAGE = 60;
    public static final double MINIMUM_GRADE = 40;
        
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite a media: ");
        double finalGrade = read.nextDouble();
        System.out.println("Digite o numero de faltas: ");
        int absence = read.nextInt();
        if (absence > LIMIT_OF_ABSENCE) {
            System.out.println("Reprovado por falta");
        } else {
            if (finalGrade >= GRADE_AVERAGE) {
                System.out.println("Aprovado"); 
            } else {
                if (finalGrade >= MINIMUM_GRADE) {
                    System.out.println("Recuperacao");
                } else {
                    System.out.println("Reprovado por nota");
                }
            }
        }
    }
 
}
