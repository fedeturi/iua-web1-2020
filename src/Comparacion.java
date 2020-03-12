import java.util.Scanner;


public class Comparacion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Primer numero: ");
        numero1 = entrada.nextInt();

        System.out.println("Segundo numero: ");
        numero2 = entrada.nextInt();

        if (numero1 > numero2) {
            System.out.printf("\nEl numero %d es mayor que %d", numero1, numero2);
        } else {
            if (numero1 == numero2) {
                System.out.println("Los dos numeros son iguales");
            } else {
                System.out.printf("\nEl numero %d es mayor que el numero %d", numero2, numero1);
            }
        }


    }

}
