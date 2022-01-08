package model;

import java.sql.Date;
import java.util.List;

public class Product {
    //id int auto_increment primary key,
    //id_brand int,
    //id_category int,
    //id_size int,
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
    private int id;
    private int id_brand;
    private int id_category;
    private String name;
    private long quantity;
    private Double price;
    private Double discount;
    private String detail;
    private Double selling_price;
    private Date create_date;
    private Date modify_date;
    private long view;
    private long rate;
    private long quantity_sale;
    private String name_brand;
    private String name_category;
    private String imgMain;
    private List<Size> sizeList;
    private List<Img> imgList;

    public String getName_brand() {
        return name_brand;
    }

    public void setName_brand(String name_brand) {
        this.name_brand = name_brand;
    }

    public String getName_category() {
        return name_category;
    }

    public void setName_category(String name_category) {
        this.name_category = name_category;
    }

    public String getImgMain() {
        return imgMain;
    }

    public void setImgMain(String imgMain) {
        this.imgMain = imgMain;
    }

    public List<Size> getSizeList() {
        return sizeList;
    }

    public void setSizeList(List<Size> sizeList) {
        this.sizeList = sizeList;
    }

    public List<Img> getImgList() {
        return imgList;
    }

    public void setImgList(List<Img> imgList) {
        this.imgList = imgList;
    }

    public Product(int id_brand, int id_category, String name, long quantity, Double price, Double discount, String detail, Double selling_price, Date create_date, Date modify_date, long view, long rate, long quantity_sale, String name_brand, String name_category, String imgMain, List<Size> sizeList, List<Img> imgList) {
        this.id_brand = id_brand;
        this.id_category = id_category;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
        this.detail = detail;
        this.selling_price = selling_price;
        this.create_date = create_date;
        this.modify_date = modify_date;
        this.view = view;
        this.rate = rate;
        this.quantity_sale = quantity_sale;
        this.name_brand = name_brand;
        this.name_category = name_category;
        this.imgMain = imgMain;
        this.sizeList = sizeList;
        this.imgList = imgList;
    }

    public Product(int id, int id_brand, int id_category, String name, long quantity, Double price, Double discount, String detail, Double selling_price, Date create_date, Date modify_date, long view, long rate, long quantity_sale, String name_brand, String name_category, String imgMain, List<Size> sizeList, List<Img> imgList) {
        this.id = id;
        this.id_brand = id_brand;
        this.id_category = id_category;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
        this.detail = detail;
        this.selling_price = selling_price;
        this.create_date = create_date;
        this.modify_date = modify_date;
        this.view = view;
        this.rate = rate;
        this.quantity_sale = quantity_sale;
        this.name_brand = name_brand;
        this.name_category = name_category;
        this.imgMain = imgMain;
        this.sizeList = sizeList;
        this.imgList = imgList;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_brand() {
        return id_brand;
    }

    public void setId_brand(int id_brand) {
        this.id_brand = id_brand;
    }

    public int getId_category() {
        return id_category;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Double getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(Double selling_price) {
        this.selling_price = selling_price;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getModify_date() {
        return modify_date;
    }

    public void setModify_date(Date modify_date) {
        this.modify_date = modify_date;
    }

    public long getView() {
        return view;
    }

    public void setView(long view) {
        this.view = view;
    }

    public long getRate() {
        return rate;
    }

    public void setRate(long rate) {
        this.rate = rate;
    }

    public long getQuantity_sale() {
        return quantity_sale;
    }

    public void setQuantity_sale(long quantity_sale) {
        this.quantity_sale = quantity_sale;
    }
}
