package com.hbuas;

public class Address {
    private int addid;
    private String city;
    private String street;

    private Orders o;

    public int getAddid() {
        return addid;
    }

    public void setAddid(int addid) {
        this.addid = addid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Orders getO() {
        return o;
    }

    public void setO(Orders o) {
        this.o = o;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addid=" + addid +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    public Address(int addid, String city, String street) {
        this.addid = addid;
        this.city = city;
        this.street = street;
    }
    public Address() {
    }
}
