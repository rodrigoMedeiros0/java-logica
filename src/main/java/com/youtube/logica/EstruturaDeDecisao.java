package com.youtube.logica;

public class EstruturaDeDecisao {

    public static void main(String[] args) {
        numeroPar();
        stringIgual();
    }

    private static void numeroPar() {
        Integer numero = 3;

        if (numero % 2 == 0) {
            //executo o codigo aqui
            System.out.println("par");
        } else {
            //executo o codigo aqui quando falso
            System.out.println("impar");
        }
    }

    private static void stringIgual() {
        String frase = "hoje é sexta feira";

        if (frase.contains("segunda feira")) {
            System.out.println("dia de tristeza");
        }else if (frase.contains("sexta feira") || frase.contains("sabado") || frase.contains("domingo")){
            System.out.println("dia de alegria");
        }else {
            System.out.println("dia normal");
        }
    }


}
