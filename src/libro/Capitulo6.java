/*
 * Copyright (c) 2020. Federico Brun.
 * https://github.com/fedeturi
 * fedejbrun@gmail.com
 */

package libro;

import ejemplo.EjemploCapitulo6;

/*
Escribir una aplcicacion en Java que ilustre el funcionamiento de paquetes, scope y overloading.
 */



public class Capitulo6 {

    private static int x = 10;

    public static void main(String[] args) {
        System.out.printf("\nUna suma aleatoria: %d", EjemploCapitulo6.newAddedRandom());
        System.out.printf("\nOtra suma aleatoria: %d", EjemploCapitulo6.newAddedRandom(43));
        System.out.printf("\nOtra suma aleatoria: %d", EjemploCapitulo6.newRandom() + EjemploCapitulo6.newRandom());
        EjemploCapitulo6.newAddedRandom(14, 67);

        System.out.println("X exterior= " + x);
        x = 15;
        System.out.println("X exterior= " + x);

        System.out.println("\n\nInicio del bucle: ");

        for (int x = 0; x < 5; x++){
            System.out.println("X exterior= " + x);
        }


    }



}
