package dao;

import model.Brand;
import model.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BrandDao implements IDao<Brand> {
    Connection connection = ConnectMySql.getConnection();
    @Override
    public List<Brand> getList() throws SQLException {
        String select = "select * from Brand";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(select);
        List<Brand> brandList = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            brandList.add(new Brand(id, name));
        }
        return brandList;
    }

    @Override
    public void insert(Brand brand) throws SQLException {
        String insert = "INSERT INTO brand (name) VALUES (?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insert);
        preparedStatement.setString(1, brand.getName());
        preparedStatement.execute();
    }

    @Override
    public void update(int id, Brand brand) throws SQLException {
        String update = "UPDATE brand SET `name` = ? WHERE (`id` = ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(update);
        preparedStatement.setString(1, brand.getName());
        preparedStatement.setInt(2, id);
        preparedStatement.execute();
    }

    @Override
    public void delete(int id) throws SQLException {
        String delete = "DELETE FROM brand WHERE id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(delete);
        preparedStatement.setInt(1, id);
        preparedStatement.execute();
    }
}
