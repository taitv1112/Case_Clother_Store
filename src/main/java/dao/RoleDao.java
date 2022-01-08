package dao;

import model.Role;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoleDao implements IDao<Role>{
    Connection connection = ConnectMySql.getConnection();
    @Override
    public List<Role> getList() throws SQLException {
        String getRole = "select * from Role";
        List<Role> roleList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(getRole);
            ResultSet resultset = preparedStatement.executeQuery();
            while (resultset.next()) {
                int id = resultset.getInt("id");
                String name = resultset.getString("name");
                roleList.add(new Role(id, name));
            }
            return roleList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public void insert(Role role) throws SQLException {

    }

    @Override
    public void update(int id, Role role) throws SQLException {

    }

    @Override
    public void delete(int id) throws SQLException {

    }
}
