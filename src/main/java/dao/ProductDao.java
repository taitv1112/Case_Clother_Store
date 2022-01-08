package dao;

import model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao implements IDao<Product> {
    Connection connection = ConnectMySql.getConnection();
    @Override
    public List<Product> getList() throws SQLException {
        String ShowCustomer = "select product.* from product";
        List<Product> productList = new ArrayList<>();
        try (
                //id int auto_increment primary key,
                //id_brand int,
                //id_category int,
                //id_size int,
                //imgMain text,
                //name varchar(255),
                //quantity bigint,
                //price double,
                //discount double,
                //detail longtext,
                //selling_price double,
                //create_date datetime,
                //modify_date datetime,
                //view bigint,
                //rate bigint,
                //quantity_sale bigint,
                PreparedStatement preparedStatement = connection.prepareStatement(ShowCustomer)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");

                productList.add(new Product());

            }
            return productList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void insert(Product product) throws SQLException {

    }

    @Override
    public void update(int id, Product product) throws SQLException {

    }

    @Override
    public void delete(int id) throws SQLException {

    }
}
