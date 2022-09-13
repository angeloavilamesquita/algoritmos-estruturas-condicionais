package estruturascondicionaiserepeticao;

import java.util.Scanner;

public class Problema02 {
    
    public static final double HOUR_VALUE = 19.50;
    public static final double IR_LIMIT = 2500;
    public static final double IR_PERCENTAGE = 0.25;
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Digite o numero de horas: ");
        double hours = read.nextDouble();
        double salary = hours * HOUR_VALUE;
        if (salary > IR_LIMIT) {
            double discount = salary * IR_PERCENTAGE;
            salary -= discount;
        }
        System.out.println("o salario eh: " + salary);
    }
 
}
