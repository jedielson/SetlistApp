package com.jedi.setlist.domain.services;

import com.jedi.setlist.domain.entities.SetList;
import com.jedi.setlist.domain.interfaces.repositories.ISetListRepository;
import com.jedi.setlist.domain.services.base.ServiceBase;

/**
 * Created by Jedi on 08-Jun-15.
 *
 */
public class SetListService extends ServiceBase<SetList> {

    public SetListService(ISetListRepository repository) {
        super(repository);
    }
}
