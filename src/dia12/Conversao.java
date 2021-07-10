package dia12;

import java.util.Scanner;

public class Conversao {

    public static double UM_METRO_QUADRADO_EM_PES_QUADRADOS = 10.76;

    public static double UM_PE_QUADRADO_EM_CENTIMETROS_QUADRADOS = 929.0;

    public static double UMA_MILHA_QUADRADA_EM_ACRES = 640.0;

    public static double UM_ACRE_EM_PES_QUADRADAS = 43.560;


    public static Double converteMetroQuadradosParaPesQuadrado(double metros) {
        return metros * UM_METRO_QUADRADO_EM_PES_QUADRADOS;
    }

        public static Double convertePesQuadradoParaCentimetrosQuadrados(double pes) {
            return pes * UM_PE_QUADRADO_EM_CENTIMETROS_QUADRADOS;
        }

            public static Double converteMilhaQuadradaEmAcres(double milha) {
                return milha * UMA_MILHA_QUADRADA_EM_ACRES;
            }

                public static Double converteMetroQuadradosParaPesQuadrado(Integer acres) {
                    return acres * UM_ACRE_EM_PES_QUADRADAS;
                }
    }


