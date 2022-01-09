package dao;

import model.Size;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SizeDao implements IDao<Size>{
    Connection connection = ConnectMySql.getConnection();



    @Override
    public List<Size> getList() throws SQLException {
        String select = "select * from Size";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(select);
        List<Size> sizeList = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            int id_product = resultSet.getInt("id_product");
            String name = resultSet.getString("name");
            sizeList.add(new Size(id,id_product, name));
        }
        return sizeList;
    }
    public List<Size> getListByIdProduct(int id) throws SQLException {
        String select = "select Size.id as id,Size.id_product as id_product,Size.name as name from Size join product on Size.id_product = product.id where product.id = "+id;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(select);
        List<Size> sizeList = new ArrayList<>();
        while (resultSet.next()) {
            int idS = resultSet.getInt("id");
            int id_product = resultSet.getInt("id_product");
            String name = resultSet.getString("name");
            sizeList.add(new Size(idS,id_product, name));
        }
        return sizeList;
    }

    @Override
    public void insert(Size size) throws SQLException {
        String insert = "INSERT INTO Size (name,id_product) VALUES (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insert);
        preparedStatement.setString(1, size.getName());
        preparedStatement.setInt(2, size.getId_product());
        preparedStatement.execute();
    }

    @Override
    public void update(int id, Size size) throws SQLException {
        String update = "UPDATE size SET `name` = ?,id_product = ? WHERE (`id` = ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(update);
        preparedStatement.setString(1, size.getName());
        preparedStatement.setInt(2, size.getId_product());
        preparedStatement.setInt(3, id);
        preparedStatement.execute();
    }

    @Override
    public void delete(int id) throws SQLException {
        String delete = "DELETE FROM size WHERE id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(delete);
        preparedStatement.setInt(1, id);
        preparedStatement.execute();
    }
}
