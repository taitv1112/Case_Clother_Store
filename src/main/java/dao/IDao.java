package dao;

import java.sql.SQLException;
import java.util.List;

public interface IDao<T> {
    List<T> getList () throws SQLException;
    void insert(T t) throws SQLException;
    void update(int id,T t) throws SQLException;
    void delete(int id) throws SQLException;
}
