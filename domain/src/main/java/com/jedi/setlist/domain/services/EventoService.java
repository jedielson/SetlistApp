package com.jedi.setlist.domain.services;

import com.jedi.setlist.domain.entities.Evento;
import com.jedi.setlist.domain.interfaces.repositories.IEventoRepository;
import com.jedi.setlist.domain.services.base.ServiceBase;

/**
 * Created by Jedi on 08-Jun-15.
 *
 */
public class EventoService extends ServiceBase<Evento> {

    public EventoService(IEventoRepository repository) {
        super(repository);
    }
}
