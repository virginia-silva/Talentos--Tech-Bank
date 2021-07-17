package dia7;

//Classe Pai

public class caneta {

    String cor;

    String tubo;

    String ponteira;

    String carga;

    Double tamanhoDaCaneta;

    Double quantidadeDeTinta = 0.5;

    double peso;

    Integer anoFabricação;




    @Override
    public String toString() {
        return "caneta{" +
                "cor='" + cor + '\'' +
                ", tubo='" + tubo + '\'' +
                ", ponteira='" + ponteira + '\'' +
                ", carga='" + carga + '\'' +
                ", tamanhoDaCaneta=" + tamanhoDaCaneta +
                ", quantidadeDeTinta=" + quantidadeDeTinta +
                '}';
    }

    public void imprimiQuantidadeDeTinta() {

        System.out.println("Quantidade de tinta = " + this.quantidadeDeTinta);




    }

}





