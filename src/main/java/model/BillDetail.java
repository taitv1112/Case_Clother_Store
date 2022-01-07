package model;

public class BillDetail {
    private int id;
    private int id_product;
    private int id_bill;
    private double quantity_product;
    private double bill_product;

    public BillDetail(int id, int id_product, int id_bill, double quantity_product, double bill_product) {
        this.id = id;
        this.id_product = id_product;
        this.id_bill = id_bill;
        this.quantity_product = quantity_product;
        this.bill_product = bill_product;
    }

    public BillDetail(int id_product, int id_bill, double quantity_product, double bill_product) {
        this.id_product = id_product;
        this.id_bill = id_bill;
        this.quantity_product = quantity_product;
        this.bill_product = bill_product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getId_bill() {
        return id_bill;
    }

    public void setId_bill(int id_bill) {
        this.id_bill = id_bill;
    }

    public double getQuantity_product() {
        return quantity_product;
    }

    public void setQuantity_product(double quantity_product) {
        this.quantity_product = quantity_product;
    }

    public double getBill_product() {
        return bill_product;
    }

    public void setBill_product(double bill_product) {
        this.bill_product = bill_product;
    }
}
