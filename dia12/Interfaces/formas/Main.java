package dia12.interfaces.formas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void mostrarFormas(List<FormaGeometrica> formas) {
        for (FormaGeometrica f : formas) {
            f.mostrar();
        }
    }


    public static void main(String[] args) {
        Ponto ponto = new Ponto(2, 3);
        Circulo circulo = new Circulo(ponto, 10);
        Cilindro cilindro = new Cilindro(circulo, 5);

        List<FormaGeometrica> formas = new ArrayList<>();
        formas.add(ponto);
        formas.add(circulo);
        formas.add(cilindro);

        mostrarFormas(formas);

    }

}
