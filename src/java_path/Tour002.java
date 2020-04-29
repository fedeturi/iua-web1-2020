package java_path;

// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

public class Tour002 {

    static char v0;
    static boolean v1;
    static byte v2;
    static short v3;
    static int v4;
    static long v5;
    static float v6;
    static double v7;

    //	static final int v_constante; // no esta permitido
    static final int v_constante = 96;

    public static void main(String[] args) {

		//final int v_constante;
		//System.out.println(v_constante); // no esta permitido

        char v0 = 65;
        boolean v1 = true;
        byte v2 = 22;
        short v3 = 33;
        int v4 = 44;
        long v5 = 55;
        float v6 = 66;
        double v7 = 77;


//		v1 = v0; // no esta permitido
        v1 = v1; // es un warning
//		v1 = v2; // no esta permitido
//		v1 = v3; // no esta permitido
//		v1 = v4; // no esta permitido
//		v1 = v5; // no esta permitido
//		v1 = v6; // no esta permitido
//		v1 = v7; // no esta permitido

//		v2 = v0; // no esta permitido
//		v2 = v1; // no esta permitido
        v2 = v2; // es un warning
//		v2 = v3; // no esta permitido
//		v2 = v4; // no esta permitido
//		v2 = v5; // no esta permitido
//		v2 = v6; // no esta permitido
//		v2 = v7; // no esta permitido

//		v3 = v0; // no esta permitido
//		v3 = v1; // no esta permitido
        v3 = v2;
        v3 = v3; // es un warning
//		v3 = v4; // no esta permitido
//		v3 = v5; // no esta permitido
//		v3 = v6; // no esta permitido
//		v3 = v7; // no esta permitido

        v4 = v0;
//		v4 = v1; // no esta permitido
        v4 = v2;
        v4 = v3;
        v4 = v4; // es un warning
//		v4 = v5; // no esta permitido
//		v4 = v6; // no esta permitido
//		v4 = v7; // no esta permitido

        v5 = v0;
//		v5 = v1; // no esta permitido
        v5 = v2;
        v5 = v3;
        v5 = v4;
        v5 = v5; // es un warning
//		v5 = v6; // no esta permitido
//		v5 = v7; // no esta permitido

        v6 = v0;
//		v6 = v1; // no esta permitido
        v6 = v2;
        v6 = v3;
        v6 = v4;
        v6 = v5;
        v6 = v6; // es un warning
//		v6 = v7; // no esta permitido

        v7 = v0;
//		v7 = v1; // no esta permitido
        v7 = v2;
        v7 = v3;
        v7 = v4;
        v7 = v5;
        v7 = v6;
        v7 = v7; // es un warning

        System.out.println(v0);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
        System.out.println(v6);
        System.out.println(v7);

    }

}

