package java_path;

public class Tour001 {
    public static void main(String[] args) {
        /*
         * Esto es un comentario de bloque
         */

        // Esto es un comentario de linea

        //	Un literal Java es un valor de tipo entero, real, lógico, carácter,
        //	cadena de caracteres o un valor nulo (null) que puede aparecer dentro de un programa.
        //	Por ejemplo: 150, 12.4, "ANA", null, 't'

        System.out.println(true); // esta linea imprime un literal boolean
        System.out.println('a'); // esta linea imprime un literal char unicode de 16 bit, min_value = \u0000,
        // max_value = \uFFFF
        System.out.println('\u0040'); // @
        System.out.println( (byte) -128); // esta linea imprime un literal byte de 8 bit (1 byte), min_value = -128,
        // max_value = 127
        System.out.println((short) -32768); // esta linea imprime un literal short de 16 bit (2 byte), min_value =
        // -32.768, max_value = 32.767
        System.out.println(-2147483648); // esta linea imprime un literal int de 32 bit (4 byte), min_value =
        // -2.147.483.648, max_value = 2.147.483.647

        System.out.println(0b00100001); // literal entero binario de tipo int
        System.out.println(0b10000000); // literal entero binario de tipo int 128
        System.out.println( -0b01111111); // literal entero binario de tipo int -127


        System.out.println(0B0010000101000101); // literal entero binario de tipo int

        System.out.println(01234); // Literal Java de tipo entero en Base octal. Está formado por 1 o más dígitos
        // del 0 al 7. El primer dígito debe ser cero.

        System.out.println(0x1A2); // Literal Java de tipo entero en Base hexadecimal. Está formado por 1 o más
        // dígitos del 0 al 9 y letras de la A a la F (mayúsculas o minúsculas). Debe
        // comenzar por 0x ó 0X.

        System.out.println(2_014_120); // Los literales de tipo entero, en cualquier base, pueden contener el carácter
        // _ para facilitar la lectura del número.

        System.out.println(3.14_15F); // Los literales de tipo entero, en cualquier base, pueden contener el carácter
        // _ para facilitar la lectura del número.

        System.out.println(0xFF_EC_DE_5E); // Los literales de tipo entero, en cualquier base, pueden contener el
        // carácter _ para facilitar la lectura del número.

        System.out.println(0xCAFE_BABE); // Los literales de tipo entero, en cualquier base, pueden contener el carácter
        // _ para facilitar la lectura del número.

        System.out.println(0x7fff_ffff_ffff_ffffL); // Los literales de tipo entero, en cualquier base, pueden contener
        // el carácter _ para facilitar la lectura del número.

        System.out.println(0b0010_0101); // Los literales de tipo entero, en cualquier base, pueden contener el carácter
        // _ para facilitar la lectura del número.

        System.out.println(0b11010010_01101001_10010100_10010010); // Los literales de tipo entero, en cualquier base,
        // pueden contener el carácter _ para facilitar la
        // lectura del número.

        System.out.println(-9223372036854775808L); // esta linea imprime un literal long de 64 bit (8 byte), min_value =
        // -9.223.372.036.854.775.808, max_value = 9.223.372.036.854.775.807

        System.out.println(0b1010000101000101101000010100010110100001010001011010000101000101L); // literal entero
        // binario de tipo
        // long

        System.out.println(1234_5678_9019_3456L); // Los literales de tipo entero, en cualquier base, pueden contener el
        // carácter _ para facilitar la lectura del número.

        System.out.println(999_99_9999L); // Los literales de tipo entero, en cualquier base, pueden contener el
        // carácter _ para facilitar la lectura del número.

        System.out.println(12.6F); // esta linea imprime un literal float de 32 bit (4 byte)
        System.out.println(13.8); // esta linea imprime un literal double de 64 bit (8 byte)
        System.out.println(26.45e-45); // notación científica

    }

}