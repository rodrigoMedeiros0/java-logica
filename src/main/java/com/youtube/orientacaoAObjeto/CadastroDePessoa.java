package com.youtube.orientacaoAObjeto;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CadastroDePessoa {
    public static void main(String[] args) throws ParseException {
        Pessoa zumba = new Pessoa();
        zumba.setNome("Zumba Games");
        zumba.setDataDeNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("21/05/2000"));
        zumba.setSexo("Masculino");
        zumba.mudarSexo("Feminino", "Zara Games");
        zumba.casar("Games", "Lol");
    }
}
