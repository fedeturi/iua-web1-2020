/*
 * Copyright (c) 2020. Federico Brun.
 * https://github.com/fedeturi
 * fedejbrun@gmail.com
 */

package libro;
import java.util.Scanner;

/*
Escribir una aplicacion en Java que nos sirva para calcular el promedio de un alumno (Crear clase Alumno)
con un bucle controlado por centinela en el cual el usuario cargue las notas manualmente.
 */

public class Capitulo4 {
    public static void main(String[] args) {
        Student student1 = new Student("Federico", "Brun");

        Scanner input = new Scanner(System.in);
        System.out.println("A continuacion, ingrese la primer nota del alumno " + student1.getName());

        int score = 0;
        int counter = 0;
        int acum = 0;
        float average;

        while (score != -1){
            System.out.println("Nueva nota: ");
            score = input.nextInt();

            if (score != -1){
                acum += score;
                counter ++;
            }

        }

        average = acum / counter;

        student1.setAverage(average);
        System.out.printf("\nEl alumno %s %s, tiene un promedio de %.2f", student1.getName(), student1.getSurname(), student1.getAverage());
        System.out.println(student1.getAverage()>6 ? "\nAprobado" : "\nReprobado" );


        }

}

class Student{

    private String name;
    private String surname;
    private float average;

    public Student(String nameParam, String surnameParam){
        this.average = 0;
        this.name = nameParam;
        this.surname = surnameParam;
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

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }
}
