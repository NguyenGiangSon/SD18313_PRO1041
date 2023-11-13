package fpt.utils;

import java.util.List;

public abstract class BaseDao<T, K> {
    abstract public void insert(T entity);
    abstract public void update(T entity);
    abstract public void delete(K id);
    abstract public T selectbyId(K id);
    abstract public List<T> selectAll();
    abstract protected List<T> selectbySql(String sql,Object... args);
}
