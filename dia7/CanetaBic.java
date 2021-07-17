package dia7;

//Objeto Filho

public class CanetaBic extends caneta {

    String tampaTraseira;

    //construtor
        CanetaBic() {
            this.tubo = "Transparente";
            this.quantidadeDeTinta = 1.0;

        }

    @Override
    public String toString() {
        return "CanetaBic{" +
                "tampaTraseira='" + tampaTraseira + '\'' +
                '}' + "\n" + super.toString();

        //super = chamando o metodo da classe pai.
    }
}
