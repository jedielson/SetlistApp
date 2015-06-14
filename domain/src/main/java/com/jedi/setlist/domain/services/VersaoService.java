package com.jedi.setlist.domain.services;

import com.jedi.setlist.domain.entities.Versao;
import com.jedi.setlist.domain.interfaces.repositories.IVersaoRepository;
import com.jedi.setlist.domain.services.base.ServiceBase;

/**
 * Created by Jedi on 08-Jun-15.
 *
 */
public class VersaoService extends ServiceBase<Versao> {

    public VersaoService(IVersaoRepository repository) {
        super(repository);
    }
}
