/*
 * Copyright (c) 2020. Federico Brun.
 * https://github.com/fedeturi
 * fedejbrun@gmail.com
 */

package libro;

public class Employee {

    static String company = "My Company LTD";

    private String name;
    private int dni;
    private int age;

    public Employee(){

    }

    public Employee(String nameParam, int dniParam, int ageParam){
        this.name = nameParam;
        this.dni = dniParam;
        this.age = ageParam;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void iAmWorking(){
        System.out.println("Estoy Trabajando");
    }
}
