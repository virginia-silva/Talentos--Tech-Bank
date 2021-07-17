package dia12.exercicios.Calculadora;


    public abstract class Calculadora {

        protected int resultado;


        public int somar(int valor1, int valor2){
            return this.resultado = valor1 + valor2;
        }

        public int sub(int valor1, int valor2){
            return this.resultado = valor1 - valor2;
        }

        public int multi(int valor1, int valor2){
            return this.resultado = valor1 * valor2;
        }

        public int div(int valor1, int valor2){
            return this.resultado = valor1 / valor2;
        }

    }


