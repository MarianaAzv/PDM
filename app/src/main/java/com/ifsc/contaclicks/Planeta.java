package com.ifsc.contaclicks;

import java.io.Serializable;

public class Planeta implements Serializable {
    String nome;

    //Bitmap image;
    Integer imagem; //São recursos da pasta drawable R.drawable.nome

    public Planeta(String nome, Integer imagem) {
        this.nome = nome;
        this.imagem = imagem;
    }
}
