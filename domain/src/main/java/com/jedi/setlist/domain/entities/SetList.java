package com.jedi.setlist.domain.entities;

import java.util.Collection;
import java.util.Date;

/**
 * Created by Jedi on 08-Jun-15.
 *
 */
public class SetList {

    private int SetListId;
    private String Nome;
    private Date Duracao;
    private int BandaId;
    private Banda banda;
    private Collection<Evento> eventos;

    public SetList() {
    }
}
