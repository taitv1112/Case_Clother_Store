package model;

public class Size {
    private int id;
    private int id_product;
    private String name;

    public Size(int id, int id_product, String name) {
        this.id = id;
        this.id_product = id_product;
        this.name = name;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
