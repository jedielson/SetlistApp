package com.jedi.setlist.domain.entities;

import java.util.Collection;
import java.util.Date;

/**
 * Created by Jedi on 08-Jun-15.
 *
 */
public class Banda {

    // region Fields

    private int BandaId;
    private String Nome;
    private Date DataDeCriacao;
    private Collection<SetList> setLists;

    // endregion

    // region Constructors

    public Banda(int bandaId, String nome, Date dataDeCriacao) {
        BandaId = bandaId;
        Nome = nome;
        DataDeCriacao = dataDeCriacao;
    }

    public Banda() {
        //necessário para OrmLite
    }

    //endregion

    // region Getters

    public int getBandaId() {
        return BandaId;
    }

    public String getNome() {
        return Nome;
    }

    public Date getDataDeCriacao() {
        return DataDeCriacao;
    }

    //endregion

    //region Setters

    public void setBandaId(int bandaId) {
        BandaId = bandaId;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setDataDeCriacao(Date dataDeCriacao) {
        DataDeCriacao = dataDeCriacao;
    }

    //endregion
}
