/*
 * Copyright (c) 2020. Federico Brun.
 * https://github.com/fedeturi
 * fedejbrun@gmail.com
 */

package libro;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
Escribir una aplicacion en Java que implemente e ilustre el funcionamiento de Arreglos y sus métodos.
 */

public class Capitulo7 {
    public static void main(String[] args) {

        int[] myArray = {4, 6, 74, 98, 23, 45, 10};

        for (int element: myArray ) {
            System.out.printf(" %d", element);
        }

    }

    public static void printArray(Estudiante[] cursoParam){
        for(Estudiante estudiante : cursoParam){
            System.out.printf("\nLas notas de %s %s son:", estudiante.getName(), estudiante.getSurname());

            int i = 1;
            for (int score : estudiante.getScores()){
                System.out.printf("\nMateria %d: %d", i, score );
                i++;
            }
        }
    }

}


class Estudiante{

    private String name;
    private String surname;
    private int age;
    private int[] scores = new int[5];

    public Estudiante(String nameParam, String surnameParam, int ageParam){
        this.name = nameParam;
        this.surname = surnameParam;
        this.age = ageParam;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }
}
