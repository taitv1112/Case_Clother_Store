package dao;

import model.Bill;
import model.Brand;
import model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BillDao implements IDao<Bill>{
    Connection connection = ConnectMySql.getConnection();
    ProductDao productDao = new ProductDao();
    @Override
    public List<Bill> getList() throws SQLException {
        String selectBillList = "SELECT bill.*,user.userName as name_user ,product.name, billdetail.bill_product as bill_product,billdetail.quantity_product as quantity_product  as name_product FROM clother_store.bill join user on bill.id_user = user.id join billdetail on bill.id = billdetail.id_bill join product on billdetail.id_product = product.id";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(selectBillList);
        List<Bill> bills = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            int id_user = resultSet.getInt("id_user");
            String name = resultSet.getString("name");
            Date create_date = resultSet.getDate("create_date");
            Date modify_date = resultSet.getDate("modify_date");
            double total = resultSet.getDouble("total");
            String status_proccess = resultSet.getString("status_proccess");
            String name_user = resultSet.getString("name_user");
            double bill_product = resultSet.getDouble("bill_product");
            long quantity_product = resultSet.getLong("quantity_product");
            List< Product > productList = productDao.getListProductByIdBill(id);
            bills.add(new Bill( id,  id_user,  create_date,  modify_date,
                     total,  status_proccess,
                      name_user, productList, bill_product, quantity_product ));
        }
        return bills;
    }

    @Override
    public void insert(Bill bill) throws SQLException {
        String insert = "INSERT INTO `clother_store`.`bill` (`id_user`, `total`, `status_proccess`) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insert);
        preparedStatement.setInt(1, bill.getId_user());
        preparedStatement.setDouble(2, bill.getTotal());
        preparedStatement.setString(3, bill.getStatus_proccess());
        preparedStatement.executeQuery();

    }


    @Override
    public void update(int id, Bill bill) throws SQLException {
        String update = "UPDATE `clother_store`.`bill` SET `id_user` = ?, `total` = ?, `status_proccess` = ? WHERE (`id` = ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(update);
        preparedStatement.setInt(1, bill.getId_user());
        preparedStatement.setDouble(2, bill.getTotal());
        preparedStatement.setString(3, bill.getStatus_proccess());
        preparedStatement.setInt(4, id);
        preparedStatement.execute();
    }

    @Override
    public void delete(int id) throws SQLException {
        String delete = "DELETE FROM bill WHERE id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(delete);
        preparedStatement.setInt(1, id);
        preparedStatement.execute();
    }

}
