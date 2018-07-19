package com.hbuas;

public class Orderitems {
    private int itemid;
    private Integer productid;
    private Integer count;
    private Integer price;

    private Orders ordersByOrderid;

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Orders getOrdersByOrderid() {
        return ordersByOrderid;
    }

    public void setOrdersByOrderid(Orders ordersByOrderid) {
        this.ordersByOrderid = ordersByOrderid;
    }

    public Orderitems(int itemid, Integer productid, Integer count, Integer price, Orders ordersByOrderid) {
        this.itemid = itemid;
        this.productid = productid;
        this.count = count;
        this.price = price;
        this.ordersByOrderid = ordersByOrderid;
    }

    public Orderitems() {
    }

    @Override
    public String toString() {
        return "Orderitems{" +
                "itemid=" + itemid +
                ", productid=" + productid +
                ", count=" + count +
                ", price=" + price +
                '}';
    }
}
