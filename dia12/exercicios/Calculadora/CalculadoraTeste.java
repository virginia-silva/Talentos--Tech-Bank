package dia12.exercicios.Calculadora;


public class CalculadoraTeste {

    public static void main(String[] args) {

        CalculadoraCientifica calc = new CalculadoraCientifica();

        System.out.println(calc.somar(56, 69));

        System.out.println(calc.sub(69, 58));

        System.out.println(calc.multi(5, 5));

        System.out.println(calc.div(10, 2));

        System.out.println(calc.raizQuadrada(49));

        System.out.println(calc.potencia(6, 5));

    }
}