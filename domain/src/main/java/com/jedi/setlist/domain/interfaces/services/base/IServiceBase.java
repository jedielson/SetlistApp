package com.jedi.setlist.domain.interfaces.services.base;

import java.util.Collection;

/**
 * Created by Jedi on 08-Jun-15.
 *
 */
public interface IServiceBase<TEntity>{

    void add(TEntity obj);
    TEntity getById(int id);
    Collection<TEntity> getAll();
    void update(TEntity obj);
    void remove(TEntity obj);
}
