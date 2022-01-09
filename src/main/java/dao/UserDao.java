package dao;

import model.Brand;
import model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements IDao<User> {
    Connection connection = ConnectMySql.getConnection();
    @Override
    public List<User> getList() throws SQLException {
        String select = "SELECT user.*, role.name as name_role FROM clother_store.user join role on user.id_role = role.id";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(select);
        List<User> userList = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String userName = resultSet.getString("userName");
            String password = resultSet.getString("password");
            String fullName = resultSet.getString("name");
            String address = resultSet.getString("address");
            String phone = resultSet.getString("phone");
            int id_role = resultSet.getInt("id_role");
            String name_role = resultSet.getString("name_role");
            userList.add(new User( id,  userName,  password,  fullName,  address,
                     phone,  id_role,  name_role));
        }
        return userList;
    }

    @Override
    public void insert(User user) throws SQLException {
        String insert = "INSERT INTO `clother_store`.`user` (`userName`, `password`, `name`, `address`, `phone`, `id_role`) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insert);
        preparedStatement.setString(1, user.getUserName());
        preparedStatement.setString(2, user.getPassword());
        preparedStatement.setString(3, user.getFullName());
        preparedStatement.setString(4, user.getAddress());
        preparedStatement.setString(5, user.getPhone());
        preparedStatement.setInt(6, user.getId_role());
        preparedStatement.execute();
    }

    @Override
    public void update(int id, User user) throws SQLException {
        String update = "UPDATE `clother_store`.`user` SET `userName` = ?, `password` = ?, `name` = ?, `address` = ?, `phone` = ?, `id_role` = ? WHERE (`id` = ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(update);
        preparedStatement.setString(1, user.getUserName());
        preparedStatement.setString(2, user.getPassword());
        preparedStatement.setString(3, user.getFullName());
        preparedStatement.setString(4, user.getAddress());
        preparedStatement.setString(5, user.getPhone());
        preparedStatement.setInt(6, user.getId_role());
        preparedStatement.setInt(7, id);
        preparedStatement.execute();
    }

    @Override
    public void delete(int id) throws SQLException {
        String delete = "DELETE FROM user WHERE id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(delete);
        preparedStatement.setInt(1, id);
        preparedStatement.execute();
    }
}
