/*
 * Copyright (c) 2020. Federico Brun.
 * https://github.com/fedeturi
 * fedejbrun@gmail.com
 */

/*Escribir una aplicacion en Java que pida al usuairo dos numers enteros
*   y muestre la suma de los dos y cual es el mayor, si son igual mostrarlo.
* */
package libro;
import java.util.Scanner;

public class Capitulo2 {
    public static void main(String[] args) {
        int number1;
        int number2;
        int sum;

        Scanner input = new Scanner(System.in);

        System.out.println("A continuacion, ingrese dos numeros enteros");
        System.out.print("\nluego, vera el resultado de la suma, y cuál de ellos es mayor");

        System.out.print("\nNumero1: ");
        number1 = input.nextInt();

        System.out.print("Numero2: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("La suma es %d", sum);
        if(number1 > number2){
            System.out.printf("El mayor es %d", number1);
        }else {
            if (number2 > number1){
                System.out.printf("El mayor es %d", number2);
            }else{
                System.out.println("Ambos numeros son iguales");
            }
        }

    }
}
