package com.jedi.setlist.domain.services.base;

import com.jedi.setlist.domain.interfaces.repositories.base.IRepositoryBase;
import com.jedi.setlist.domain.interfaces.services.base.IServiceBase;

import java.util.Collection;

/**
 * Created by Jedi on 08-Jun-15.
 *
 */
public class ServiceBase<TEntity> implements IServiceBase<TEntity>{

    private IRepositoryBase<TEntity> _repository;

    public ServiceBase(IRepositoryBase<TEntity> repository)
    {
        _repository = repository;
    }

    public void add(TEntity obj)
    {
        _repository.add(obj);
    }

    public TEntity getById(int id)
    {
        return _repository.getById(id);
    }

    public Collection<TEntity> getAll()
    {
        return _repository.getAll();
    }

    public void update(TEntity obj)
    {
        _repository.update(obj);
    }

    public void remove(TEntity obj)
    {
        _repository.remove(obj);
    }
}
