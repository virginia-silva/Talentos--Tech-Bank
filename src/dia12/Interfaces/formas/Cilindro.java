package dia12.interfaces.formas;

public class Cilindro implements FormaGeometrica {

    private Circulo base;

    private double altura;

    public Cilindro(Circulo b, double a) {
        this.base = b;
        this.altura = a;
    }


    @Override
    public String forma() {
        return "Cilindro: base = " + base.forma() + "; altura = " + altura;
    }

    @Override
    public void mostrar() {
        System.out.println(forma());
    }
}
