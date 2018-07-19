package com.hbuas;


import java.util.Collection;

public class Orders {
    private int orderid;
    private String times;
    private Integer status;
    private Integer userid;

    private  Address add;
    private Collection<Orderitems> orderitemsByOrderid;

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public Collection<Orderitems> getOrderitemsByOrderid() {
        return orderitemsByOrderid;
    }

    public void setOrderitemsByOrderid(Collection<Orderitems> orderitemsByOrderid) {
        this.orderitemsByOrderid = orderitemsByOrderid;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Orders(int orderid, String times, Integer status, Integer userid, Address add) {
        this.orderid = orderid;
        this.times = times;
        this.status = status;
        this.userid = userid;
        this.add = add;
    }

    public Orders() {
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderid=" + orderid +
                ", times='" + times + '\'' +
                ", status=" + status +
                ", userid=" + userid +
                ", add=" + add +
                ", orderitemsByOrderid=" + orderitemsByOrderid +
                '}';
    }
}
