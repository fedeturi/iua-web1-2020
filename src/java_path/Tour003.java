package java_path;
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html

public class Tour003 {

    public static void main(String[] args) {

        System.out.println(1 + 16 / 2 * 2); // 16 / 2 = 8 ---> 8 * 2 = 16 ---> 1 + 16 = 17
        System.out.println(1 + 16 / (2 * 2)); // 2 * 2 = 4 ---> 16 / 4 = 4 ---> 4 + 1 = 5
        System.out.println(1 + (16 / 2) * 2); // 16 / 2 = 8 ---> 8 * 2 = 16 ---> 1 + 16 = 17
        System.out.println((1 + 16) / 2 * 2); // 1 + 16 = 17 ---> 17 / 2 = 8 ---> 8 * 2 = 16
        System.out.println((double) ((1 + 16) / 2 * 2)); // 1 + 16 = 17 ---> 17 / 2 = 8 ---> 8 * 2 = 16 --> trunca 16 a
        // double = 16.0
        System.out.println((1.0 + 16.0) / 2.0 * 2.0); // 1.0 + 16.0 = 17.0 ---> 17.0 / 2.0 = 8.5 ---> 8.5 * 2.0 = 17.0
        System.out.println((1.0 + 16.0) / 2.0 * 2); // 1.0 + 16.0 = 17.0 ---> 17.0 / 2 = 8.5 ---> 8.5 * 2.0 = 17.0
        System.out.println(17.0 / 2); // 8.5
        System.out.println((1.0 + 16.0) / (2.0 * 2.0)); // 1.0 + 16.0 = 17.0 ---> 2.0 * 2.0 = 4.0 ---> 17.0 / 4.0 = 4.25
        System.out.println((int) 4.25); // trunca 4.25 a entero, descarta la parte decimal sin redondeo
        System.out.println((int) 14.000);

        int x; //Declaracion
        x = 25 + 9 - 5 * 2 / 36; //Inicializacion

        System.out.println(x);

        x = 2_147_483_647; // 2147483647 Ó 2.147.483.647

        System.out.println(x);

        x = x + 1; //Contador

        System.out.println(x);

        byte b = 127;

        System.out.println(b);

        b = (byte) (b + 1); // (b + 1) = un literal entero

        System.out.println(b);

        int c = 10;

        c += 1;

        System.out.println(c);

        c -= 1;

        System.out.println(c);

        c *= 2; // c = c * 2

        System.out.println(c);

        c /= 2;

        System.out.println(c);

        c ++;

        System.out.println(c);

        c --;

        System.out.println(c);

        ++ c;

        System.out.println(c); // 11

        System.out.println(c++); // muestra 11 y luego suma y da 12
        System.out.println(c);
        System.out.println(++c); // suma y da 13 y muestra 13


    }

}
