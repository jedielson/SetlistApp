package com.jedi.setlist.domain.entities;

import java.util.Date;

/**
 * Created by Jedi on 08-Jun-15.
 *
 */
public class Versao {

    private int VersaoId;
    private String Titulo;
    private String Artista;
    private Date Duracao;
    private String Cor;
    private int BPM;
    private String Tom;
    private String Comentarios;
    private int MusicaId;
    private Musica musica;

    public Versao() {
    }
}
