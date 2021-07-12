package dia12.exercicios.Contador;

public class testaContador {

    public static void main(String[] args) {

        Contador cont = new Contador();
        System.out.println(Contador.getContaInstanciacoes());
        Contador cont2 = new Contador();
        System.out.println(Contador.getContaInstanciacoes());
        Contador cont3 = new Contador();
        System.out.println(Contador.getContaInstanciacoes());

        Contador.zerarContador();
        System.out.println(Contador.getContaInstanciacoes());

        Contador cont4 = new Contador();
        System.out.println(Contador.getContaInstanciacoes());
        Contador cont5 = new Contador();
        System.out.println(Contador.getContaInstanciacoes());

    }
}
