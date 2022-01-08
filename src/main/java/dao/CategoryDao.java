package dao;

import model.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryDao implements IDao<Category> {
    Connection connection = ConnectMySql.getConnection();
    @Override
    public List<Category> getList() throws SQLException {
        String select = "select * from category";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(select);
        List<Category> categoryList = new ArrayList<>();
        while (resultSet.next()) {
            int idCategory = resultSet.getInt("id");
            String nameCategory = resultSet.getString("name");
            categoryList.add(new Category(idCategory, nameCategory));
        }
        return categoryList;
    }

    @Override
    public void insert(Category category) throws SQLException {
        String insert = "INSERT INTO category (name) VALUES (?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insert);
        preparedStatement.setString(1, category.getName());
        preparedStatement.execute();
    }

    @Override
    public void update(int id, Category category) throws SQLException {
        String update = "UPDATE category SET `name` = ? WHERE (`id` = ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(update);
        preparedStatement.setString(1, category.getName());
        preparedStatement.setInt(2, id);
        preparedStatement.execute();
    }

    @Override
    public void delete(int id) throws SQLException {
        String delete = "DELETE FROM category WHERE id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(delete);
        preparedStatement.setInt(1, id);
        preparedStatement.execute();
    }
}
