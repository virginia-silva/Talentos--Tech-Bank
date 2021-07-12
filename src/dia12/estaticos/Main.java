package dia12.estaticos;

public class Main {

    public static void main(String[] args) {
        System.out.println(Exemplos.PI);


        Exemplos ex = new Exemplos();
        System.out.println(ex.pi2);

        ex.pi2 = 123.0;

        System.out.println(ex.pi2);
        System.out.println(Exemplos.PI);

        // Exemplos.pi = 999.0;

        System.out.println(Exemplos.PI);

        Exemplos ex2 = new Exemplos();
        System.out.println(ex2.pi2);


        System.out.println(Integer.MAX_VALUE);


        Exemplos.helloStatic();

        Matematica matematica = new Matematica();
        matematica.ah = 1;
        matematica.bh = 100;

        matematica.somaDeAhMaisBh();

        Matematica matematica1 = new Matematica();
        matematica1.somaDeAhMaisBh();

        Matematica.somaDeAhMaisBh(1, 99);

    }

}
