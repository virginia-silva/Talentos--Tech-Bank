package dia2;

import javax.swing.*;

public class exercicio5 {

    public static void main(String[] args) {

        int A = 0;
        int B = 0;
        int adicao;
        int subtracao;
        int multiplicacao;
        int divisao;

        A = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));

        adicao = ((A + B));
        subtracao = (A - B);
        multiplicacao = (A * B);
        divisao = (A / B);

        System.out.println("A adicao entre os dois valores é " + adicao);
        System.out.println("a subtracao é" + subtracao);
        System.out.println("a multiplicacao é" + multiplicacao);
        System.out.println("a divisao é" + divisao);
    }
}
