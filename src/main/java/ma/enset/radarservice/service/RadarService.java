package ma.enset.radarservice.service;

import java.util.List;

public interface RadarService<T> {
    public T findById(Long id);
    public List<T> findAll();
    public void deleteById(Long id);
    public T update(Long id, T o);
    public T save(T o);
}
