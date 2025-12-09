
package br.edu.ifms.cinema.dao;

import java.util.List;

public interface GenericDAO<T, ID> {
    T add(T entity);
    T update(T entity);
    void remove(T entity);
    T getById(ID id);
    List<T> getAll();
}
