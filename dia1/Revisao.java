package dia1;

public class Revisao {

    public static void main(String[] args) {
        short s = 123;
        int i = s;
        long l = i;
        float f = l;
        double d = f;


        double d2 = 100000000000000.00;
        float f2 = (float) d2;
        long l2 = (long) f2;
        int i2 = (int) l2;
        short s2 = (short) i2;

        System.out.println(s2);


        short a1 = 123;
        short b1 = 123;
        int c1 = a1 + b1;

        System.out.println(c1);


        int a2 = 123;
        int b2 = 123;
        int c2 = a2 + b2;

        System.out.println(c2);

        int maiorInteiroA = 2147483647;
        int maiorInteiroB = 2147483647;

        int resultado = maiorInteiroA + maiorInteiroB;
        System.out.println(resultado);

        long resultLong = (long) maiorInteiroA + (long) maiorInteiroB;
        long resultLong3 = maiorInteiroA * 1L + maiorInteiroB * 1L;
        System.out.println(resultLong);
        System.out.println(resultLong3);


        int xpto = 1;
        long xpto2 = 2;
        long resultXpto = xpto + xpto2;


        System.out.println("-----------------");

        // Divisão de inteiros
        System.out.println(1 / 1);
        System.out.println(1 / 2);
        System.out.println(3 / 1);
        System.out.println(9 / 3);

        // Divisão de double
        System.out.println(1.0 / 1.0);
        System.out.println(1.0 / 2.0);
        System.out.println(3.0 / 1.0);
        System.out.println(9.0 / 3.0);

        System.out.println((double) 1 / 1);
        System.out.println((double) 1 / 2);
        System.out.println((double) 3 / 1);
        System.out.println((double) 9 / 3);

        System.out.println((double) 1 / (double) 1);
        System.out.println((double) 1 / (double) 2);
        System.out.println((double) 3 / (double) 1);
        System.out.println((double) 9 / (double) 3);

    }

}
