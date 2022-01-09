package dao;

import model.BillDetail;
import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class BillDetailDao implements IDao<BillDetail>{
    Connection connection = ConnectMySql.getConnection();
    ProductDao productDao = new ProductDao();

    @Override
    public List<BillDetail> getList() throws SQLException {
        return null;
    }

    @Override
    public void insert(BillDetail billDetail) throws SQLException {
        String insert = "INSERT INTO `clother_store`.`billdetail` ( `id_product`, `id_bill`, `quantity_product`,bill_product) VALUES ( ?,?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insert);
        preparedStatement.setInt(1, billDetail.getId_product());
        preparedStatement.setInt(2, billDetail.getId_bill());
        preparedStatement.setDouble(3, billDetail.getQuantity_product());
        Product product = productDao.findProductById(billDetail.getId_product());
        preparedStatement.setDouble(4, billDetail.getQuantity_product()*product.getSelling_price());
        preparedStatement.execute();
    }


    @Override
    public void update(int id, BillDetail billDetail) throws SQLException {
        String update = "UPDATE `clother_store`.`billdetail` SET `id_product` = ?, `id_bill` = ?, `quantity_product` =? WHERE (`id` = ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(update);
        preparedStatement.setInt(1, billDetail.getId_product());
        preparedStatement.setInt(2, billDetail.getId_bill());
        preparedStatement.setInt(2, billDetail.getId_bill());
        preparedStatement.execute();
    }

    @Override
    public void delete(int id) throws SQLException {

    }
}
