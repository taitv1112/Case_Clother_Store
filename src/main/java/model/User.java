package model;

public class User {
    private int id;
    private String userName;
    private String password;
    private String fullName;
    private String address;
    private String phone;
    private int id_role;
    private String name_role;

    public User(int id, String userName, String password, String fullName, String address, String phone, int id_role, String name_role) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.id_role = id_role;
        this.name_role = name_role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }

    public String getName_role() {
        return name_role;
    }

    public void setName_role(String name_role) {
        this.name_role = name_role;
    }
}
