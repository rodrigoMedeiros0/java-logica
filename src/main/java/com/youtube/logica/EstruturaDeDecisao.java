package com.youtube.logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EstruturaDeDecisao {

    public static void main(String[] args) throws ParseException {
        numeroPar();
        stringIgual();
        stringInicia();
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

    private static void stringInicia() {
        String palavra = "bobeira";

        if (palavra.startsWith("a")) {
            System.out.println("palavra iniciada com a");
        } else {
            System.out.println("palavra iniciada com outra letra");
        }
    }

}
