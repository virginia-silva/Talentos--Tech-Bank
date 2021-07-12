package dia12.interfaces.formas;

public class Circulo implements FormaGeometrica {

    private Ponto centro;

    private double raio;

    public Circulo(Ponto p, double raio) {
        this.centro = p;
        this.raio = raio;
    }


    @Override
    public String forma() {
        return "Circulo: centro = " + centro.forma() + "; raio = " + raio;
    }

    @Override
    public void mostrar() {
        System.out.println(forma());
    }
}
