package br.ufpb.cc.mps.lab2.infra;

import java.io.IOException;

public interface PersistenceInterface<T> {

    public void save(T obj) throws PersistenceException;

    public T load() throws PersistenceException;

}
