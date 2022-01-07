package model;

import java.sql.Date;

public class Bill {
    private int id;
    private int id_user;
    private Date create_date;
    private Date modify_date;
    private double total;
    private String status_proccess;
    private String status_id;
    private String name_user;

    public Bill(int id, int id_user, Date create_date, Date modify_date, double total, String status_proccess, String status_id, String name_user) {
        this.id = id;
        this.id_user = id_user;
        this.create_date = create_date;
        this.modify_date = modify_date;
        this.total = total;
        this.status_proccess = status_proccess;
        this.status_id = status_id;
        this.name_user = name_user;
    }

    public Bill(int id_user, Date create_date, Date modify_date, double total, String status_proccess, String status_id, String name_user) {
        this.id_user = id_user;
        this.create_date = create_date;
        this.modify_date = modify_date;
        this.total = total;
        this.status_proccess = status_proccess;
        this.status_id = status_id;
        this.name_user = name_user;
    }

    public Bill() {
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getStatus_proccess() {
        return status_proccess;
    }

    public void setStatus_proccess(String status_proccess) {
        this.status_proccess = status_proccess;
    }

    public String getStatus_id() {
        return status_id;
    }

    public void setStatus_id(String status_id) {
        this.status_id = status_id;
    }
}
