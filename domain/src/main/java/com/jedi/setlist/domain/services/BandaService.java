package com.jedi.setlist.domain.services;

import com.jedi.setlist.domain.entities.Banda;
import com.jedi.setlist.domain.interfaces.repositories.IBandaRepository;
import com.jedi.setlist.domain.interfaces.services.IBandaService;
import com.jedi.setlist.domain.services.base.ServiceBase;

/**
 * Created by Jedi on 08-Jun-15.
 *
 */
public class BandaService extends ServiceBase<Banda> implements IBandaService {


    public BandaService(IBandaRepository repository) {
        super(repository);
    }
}
