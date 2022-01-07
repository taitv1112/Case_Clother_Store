package model;

public class Img {
    private int id;
    private int id_product;
    private String url;

    public Img(int id, int id_product, String url) {
        this.id = id;
        this.id_product = id_product;
        this.url = url;
    }

    public Img(int id_product, String url) {
        this.id_product = id_product;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
