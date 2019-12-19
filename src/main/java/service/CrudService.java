package service;

public interface CrudService<T> {

    void save(T t);

    T getById(int id);

    void update(T t);

    void deleteById(int id);
}
