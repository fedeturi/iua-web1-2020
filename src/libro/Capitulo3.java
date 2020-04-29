/*
 * Copyright (c) 2020. Federico Brun.
 * https://github.com/fedeturi
 * fedejbrun@gmail.com
 */

package libro;
import java.util.Scanner;


/*
-Crear Una aplicacion en Java que instancie tres objetos desde una clase Employee
y acceda a sus atributos a traveś de métodos Set y Get.
-Debe incluir un constructor.
-Un atributo estático y un método estatico.
 */

public class Capitulo3 {

    public static void main(String[] args) {
        Employee emptyEmployee = new Employee();
        Employee juan = new Employee("Juan", 29589689, 30);
        Employee matias = new Employee("Matias", 25435689, 40);

        Scanner input = new Scanner(System.in);

        System.out.println("Nombre para el primer empleado");
        String newName = input.next();
        System.out.println("DNI para el primer empleado");
        int newDni = input.nextInt();
        System.out.println("Edad para el primer empleado");
        int newAge = input.nextInt();

        emptyEmployee.setName(newName);
        emptyEmployee.setAge(newAge);
        emptyEmployee.setDni(newDni);

        System.out.printf("\n%s tiene %d años y su DNI es %d", emptyEmployee.getName(), emptyEmployee.getAge() , emptyEmployee.getDni() );
        System.out.printf("\n%s tiene %d años y su DNI es %d", juan.getName(), juan.getAge() , juan.getDni() );
        System.out.printf("\n%s tiene %d años y su DNI es %d\n", matias.getName(), matias.getAge() , matias.getDni() );

        System.out.println(juan.getName() + " trabaja para " + Employee.company + " y tiene " + Integer.toString(juan.getAge()));
        Employee.iAmWorking();


    }



}

