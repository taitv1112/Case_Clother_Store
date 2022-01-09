package service;

import java.sql.SQLException;
import java.util.List;

public interface IService<T> {
    List<T> getList() throws SQLException;
    void save(T t) throws SQLException;
    void update(int id,T t) throws SQLException;
    void delete(int id) throws SQLException;

}
