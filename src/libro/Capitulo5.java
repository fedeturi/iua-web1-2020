/*
 * Copyright (c) 2020. Federico Brun.
 * https://github.com/fedeturi
 * fedejbrun@gmail.com
 */

package libro;

import java.util.Scanner;

/*
Escribir una aplicación en Java que proporcione un conjunto de operaciónes matemáticas utilizando métodos
estáticos de la clase Math.
 */

public class Capitulo5 {
    public static void main(String[] args) {
        System.out.println("\nA continuación, elija una operación matemática para realizar:");
        System.out.println("1: Suma de 10 + 30  - 2:Potencia base 3 exp 5 - 3:Circunferencia - 4:Promedio de N números - " +
                "5:Raíz cuadrada de 123");

        Scanner input = new Scanner(System.in);

        int option = input.nextInt();
        double average;

        switch (option){
            case 1:
                System.out.printf("\n La suma de 10 + 30 es igual a: %d", addition(10, 30));
                break;
            case 2:
                System.out.printf("\n La potencia de base 3 exp 5 es igual a: %f", power(3,5));
                break;
            case 3:
                System.out.printf("\n La circunferencia de un circulo de radio 4.5mts es de %fmts", circumference(4.5));
                break;
            case 4:
                average = average();
                System.out.printf("\nEl promedio es de %f", average);
                break;
            case 5:
                System.out.printf("\n La raíz cuadrada de 123 es igual a: %f", sqRoot(123));
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;


        }


    }

    public static int addition(int x, int y){
        return x + y;
    }

    public static double power(int base, int exp){
        return Math.pow(base, exp);
    }

    public static double circumference(double radius){
        return 2 * Math.PI * radius;
    }

    public static double sqRoot(int number){
        return Math.sqrt(number);
    }

    public static double average(){
        Scanner input = new Scanner(System.in);

        int counter;
        int number;
        int acum = 0;

        System.out.println("\nCon cuantos numeros vamos a trabajar?");
        counter = input.nextInt();

        for(int i = 0 ; i < counter; i++ ) {
            System.out.printf("N%d: ", (i + 1));
            number = input.nextInt();
            acum += number;
        }

        return acum / counter;

    }

}
