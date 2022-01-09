package service;

import dao.BillDao;
import dao.BillDetailDao;
import dao.ConnectMySql;
import dao.ProductDao;
import model.Bill;
import model.BillDetail;
import model.Product;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BillService implements IService<Bill>{
    BillDao billDao = new BillDao();
    BillDetailDao billDetailDao = new BillDetailDao();
    ProductDao productDao = new ProductDao();
    Connection connection = ConnectMySql.getConnection();
    @Override
    public List<Bill> getList() {
        return null;
    }

    @Override
    public void save(Bill bill) {

    }
    public void save(List<Product> productList, Bill bill) throws SQLException {
        connection.setAutoCommit(false);
        billDao.insert(bill);
        Bill bill1 = billDao.getList().get(billDao.getList().size()-1);
        for (Product p: productList) {
            int id_product = p.getId();
            int id_bill = bill1.getId();
            double quantity_product = p.getQuantity();
            double bill_product = quantity_product * p.getPrice();
            billDetailDao.insert(new BillDetail( id_product,  id_bill,  quantity_product,  bill_product));
         Product product = productDao.findProductById(p.getId());
         product.setQuantity(product.getQuantity()-p.getQuantity());
         product.setQuantity_sale(product.getQuantity_sale()+p.getQuantity());
         productDao.update(p.getId(),product);
        }
        connection.commit();

    }

    @Override
    public void update(int id, Bill bill) {

    }

    @Override
    public void delete(int id) {

    }
}
