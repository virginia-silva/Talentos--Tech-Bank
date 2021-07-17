package dia4;

public class exercicio5 {

    public static void main(String[] args) {

        System.out.println("Este programa imprime uma pirámide a base de números.");
        System.out.print("Por favor, coloque a altura da pirámide:");
        int alturaIntroducida = Integer.parseInt(System.console().readLine());

        int altura = 1;
        int i = 0;
        int espacos = alturaIntroducida - 1;

        while (altura <= alturaIntroducida) {

                    for (i = 1; i <= espacos; i++) {
                System.out.print(" ");
            }

                    for (i = 1; i < altura; i++) {
                System.out.print(i);
            }

            for (i = altura; i > 0; i--) {
                System.out.print(i);
            }

            System.out.println();

            altura++;
            espacos--;
        }
    }
}
