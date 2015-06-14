package com.jedi.setlist.domain.interfaces.repositories.base;

import java.util.Collection;

/**
 * Created by Jedi on 08-Jun-15.
 *
 */
public interface IRepositoryBase<TEntity> {

    void add(TEntity obj);
    TEntity getById(int id);
    Collection<TEntity> getAll();
    void update(TEntity obj);
    void remove(TEntity obj);

}
