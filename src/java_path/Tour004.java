package java_path;

// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html

public class Tour004 {

    public static void main(String[] args) {

        System.out.println(true);
        System.out.println(false);

        System.out.println(!true);
        System.out.println(!false);

        // -----------------------------------------------------------

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);
        System.out.println(false && true);

        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & false);
        System.out.println(false & true);

        // -----------------------------------------------------------

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);
        System.out.println(false || true);

        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | false);
        System.out.println(false | true);

        System.out.println("--------------------------------------");

        System.out.println(false | true && true || false);
        System.out.println(false || true);
        System.out.println(!(false || true));

        // -----------------------------------------------------------

        boolean b = false | true && true || false;

        System.out.println(b);

        b = !b;

        System.out.println(b);

        // -----------------------------------------------------------

        System.out.println( 3 > 2);

        System.out.println( 3 > 2 && 2 == 2);
        System.out.println( 3 > 2 & 2 == 2);

        System.out.println( 3 > 2 || 2 == 2);
        System.out.println( 3 > 2 | 2 == 2);

        System.out.println( 3 < 2 || 2 == 2);
        System.out.println( 3 < 2 | 2 == 2);

        System.out.println( 3 > 2 || 2 != 2);
        System.out.println( 3 > 2 | 2 != 2);

        b = 3 > 2 && 2 != 2;

        System.out.println(b);

    }

}
