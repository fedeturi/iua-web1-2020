/*
 * Copyright (c) 2020. Federico Brun.
 * https://github.com/fedeturi
 * fedejbrun@gmail.com
 */

package ejemplo;

import java.security.SecureRandom;


public class EjemploCapitulo6 {

    private static SecureRandom randomNumber = new SecureRandom();

    public static int newRandom(){
        return randomNumber.nextInt();
    }

    public static int newAddedRandom(int x){
        return x + randomNumber.nextInt();
    }

    public static  int newAddedRandom(){
        return randomNumber.nextInt() + randomNumber.nextInt();
    }

    public static void newAddedRandom(int x, int y){
        int newRandom = randomNumber.nextInt();
        System.out.printf("\nEste metodo suma los valores de %d + %d + (x)", x, y);
        System.out.printf("\nEl resultado de %d + %d + (x=%d) es: %d", x, y, newRandom, (x + y + newRandom));

    }

}
