package com.jedi.setlist.domain.services;

import com.jedi.setlist.domain.entities.Musica;
import com.jedi.setlist.domain.interfaces.repositories.IMusicaRepository;
import com.jedi.setlist.domain.services.base.ServiceBase;

/**
 * Created by Jedi on 08-Jun-15.
 *
 */
public class MusicaService extends ServiceBase<Musica>{

    public MusicaService(IMusicaRepository repository) {
        super(repository);
    }
}
