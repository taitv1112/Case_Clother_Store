package dao;

import model.Img;
import model.Product;
import model.Size;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao implements IDao<Product> {
    Connection connection = ConnectMySql.getConnection();
    SizeDao  sizeDao = new SizeDao();
    ImgDao imgDao = new ImgDao();
    @Override
    public List<Product> getList() throws SQLException {
        String ShowCustomer = "select product.*,brand.name as name_brand, category.name as name_category from product join brand on product.id_brand = brand.id join category on product.id_category = category.id_category ";
        List<Product> productList = new ArrayList<>();
        try (
                PreparedStatement preparedStatement = connection.prepareStatement(ShowCustomer)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int id_brand = rs.getInt("id_brand");
                int id_category = rs.getInt("id_category");
                String name = rs.getString("name");
                long quantity = rs.getLong("quantity");
                double price = rs.getDouble("price");
                double discount = rs.getDouble("discount");
                String detail = rs.getString("detail");
                double selling_price = rs.getDouble("selling_price");
                Date create_date = rs.getDate("create_date");
                Date modify_date = rs.getDate("modify_date");
                long view = rs.getLong("view");
                long rate = rs.getLong("rate");
                long quantity_sale = rs.getLong("quantity_sale");
                String name_brand = rs.getString("name_brand");
                String name_category = rs.getString("name_category");
                String imgMain = rs.getString("imgMain");
                List<Size> sizeList = sizeDao.getListByIdProduct(id);
                List<Img> imgList = imgDao.getListByIdProduct(id);
                productList.add(new Product( id,  id_brand,  id_category,  name,  quantity,  price,
                    discount,  detail,  selling_price,  create_date,  modify_date,
                    view,  rate,  quantity_sale,  name_brand,  name_category,
                         imgMain,  sizeList,  imgList));
            }
            return productList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public Product findProductById(int id) throws SQLException {
        for (Product p:getList()) {
            if(id == p.getId()){
                return p;
            }
        }
        return null;
    }
    public List<Product> getListProductByIdBill(int idBill) throws SQLException {
        String ShowCustomer = "select product.*,brand.name as name_brand, category.name as name_category from product " +
                "join brand on product.id_brand = brand.id " +
                "join category on product.id_category = category.id_category " +
                "join billdetail on product.id = billdetail.id_product " +
                "join bill on billdetail.id_bill = bill.id " +
                "where bill.id =" + idBill ;
        List<Product> productList = new ArrayList<>();
        try (
                PreparedStatement preparedStatement = connection.prepareStatement(ShowCustomer)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int id_brand = rs.getInt("id_brand");
                int id_category = rs.getInt("id_category");
                String name = rs.getString("name");
                long quantity = rs.getLong("quantity");
                double price = rs.getDouble("price");
                double discount = rs.getDouble("discount");
                String detail = rs.getString("detail");
                double selling_price = rs.getDouble("selling_price");
                Date create_date = rs.getDate("create_date");
                Date modify_date = rs.getDate("modify_date");
                long view = rs.getLong("view");
                long rate = rs.getLong("rate");
                long quantity_sale = rs.getLong("quantity_sale");
                String name_brand = rs.getString("name_brand");
                String name_category = rs.getString("name_category");
                String imgMain = rs.getString("imgMain");
                List<Size> sizeList = sizeDao.getListByIdProduct(id);
                List<Img> imgList = imgDao.getListByIdProduct(id);
                productList.add(new Product( id,  id_brand,  id_category,  name,  quantity,  price,
                        discount,  detail,  selling_price,  create_date,  modify_date,
                        view,  rate,  quantity_sale,  name_brand,  name_category,
                        imgMain,  sizeList,  imgList));
            }
            return productList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void insert(Product product) throws SQLException {
        String insert = "INSERT INTO product (`id_brand`, `id_category`, `imgMain`, `name`, `quantity`," +
                " `price`, `discount`, `detail`) VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insert);
        preparedStatement.setInt(1, product.getId_brand());
        preparedStatement.setInt(2, product.getId_category());
        preparedStatement.setString(3, product.getImgMain());
        preparedStatement.setString(4, product.getName());
        preparedStatement.setLong(5, product.getQuantity());
        preparedStatement.setDouble(6, product.getPrice());
        preparedStatement.setDouble(7, product.getDiscount());
        preparedStatement.setString(8, product.getDetail());
        preparedStatement.execute();
    }

    @Override
    public void update(int id, Product product) throws SQLException {
        String update = "UPDATE `clother_store`.`product` SET `id_brand` = ?, `id_category` = ?, `imgMain` = ?, `name` = ?, `quantity` = ?, `price` = ?, `discount` = ?, `detail` = ? WHERE (`id` = ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(update);
        preparedStatement.setInt(1, product.getId_brand());
        preparedStatement.setInt(2, product.getId_category());
        preparedStatement.setString(3, product.getImgMain());
        preparedStatement.setString(4, product.getName());
        preparedStatement.setLong(5, product.getQuantity());
        preparedStatement.setDouble(6, product.getPrice());
        preparedStatement.setDouble(7, product.getDiscount());
        preparedStatement.setString(8, product.getDetail());
        preparedStatement.setInt(9, id);
        preparedStatement.execute();

    }


    @Override
    public void delete(int id) throws SQLException {
        String delete = "DELETE FROM `clother_store`.`product` WHERE (`id` = ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(delete);
        preparedStatement.setInt(1, id);
        preparedStatement.execute();
    }
}
