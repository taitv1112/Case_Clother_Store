package dao;

import model.Img;
import model.Size;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ImgDao implements IDao<Img> {
    Connection connection = ConnectMySql.getConnection();

    @Override
    public List<Img> getList() throws SQLException {
        String select = "select * from Img";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(select);
        List<Img> imgList = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            int id_product = resultSet.getInt("id_product");
            String url = resultSet.getString("url");
            imgList.add(new Img(id,id_product, url));
        }
        return imgList;
    }

    public List<Img> getListByIdProduct(int idP) throws SQLException {
        String select = "select Img.id as id,Img.id_product as id_product,Img.name as name from Img join product on Img.id_product = product.id where product.id = "+idP;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(select);
        List<Img> imgList = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            int id_product = resultSet.getInt("id_product");
            String url = resultSet.getString("url");
            imgList.add(new Img(id,id_product, url));
        }
        return imgList;
    }

    @Override
    public void insert(Img img) throws SQLException {
        String insert = "INSERT INTO Img (id_product,url) VALUES (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insert);
        preparedStatement.setInt(1, img.getId_product());
        preparedStatement.setString(2, img.getUrl());
        preparedStatement.execute();
    }

    @Override
    public void update(int id, Img img) throws SQLException {
        String update = "UPDATE img SET `url` = ?,id_product = ? WHERE (`id` = ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(update);
        preparedStatement.setString(1, img.getUrl());
        preparedStatement.setInt(2, img.getId_product());
        preparedStatement.setInt(3, id);
        preparedStatement.execute();
    }

    @Override
    public void delete(int id) throws SQLException {
        String delete = "DELETE FROM img WHERE id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(delete);
        preparedStatement.setInt(1, id);
        preparedStatement.execute();
    }
}
