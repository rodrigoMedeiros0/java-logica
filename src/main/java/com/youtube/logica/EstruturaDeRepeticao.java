package com.youtube.logica;

import java.util.ArrayList;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        listaDePalavras();
        forClassico();
    }

    private static void listaDePalavras() {
        ArrayList<String> palavras = new ArrayList<>();

        palavras.add("PS5");
        palavras.add("Nitendo Switch");
        palavras.add("Xbox One");
        palavras.add("Nitendo DS");
        palavras.add("Xbox 360");

        for(String palavra : palavras) {
            System.out.println(palavra);
        }

        //outro jeito
        //palavras.forEach(palavra -> System.out.println(palavra));
    }

    private static void forClassico() {
        ArrayList<String> palavras = new ArrayList<>();

        palavras.add("PS5");
        palavras.add("Nitendo Switch");
        palavras.add("Xbox One");
        palavras.add("Nitendo DS");
        palavras.add("Xbox 360");

        for (int posicao = 0; posicao < palavras.size(); posicao++) {
            System.out.println(palavras.get(posicao));
        }
    }


}
