package com.example.model;

import java.math.BigDecimal;

public class Orders {
    //    订单ID
    private Integer id;
    //    订单编号,用于区分是否为同一个订单
    private Integer orderno;
    //    用户ID
    private Integer userid;
    //    商品ID
    private Integer goodsid;
    //    订单数量
    private Integer ordernum;
    //    订单价格
    private BigDecimal orderprice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderno() {
        return orderno;
    }

    public void setOrderno(Integer orderno) {
        this.orderno = orderno;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public BigDecimal getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(BigDecimal orderprice) {
        this.orderprice = orderprice;
    }
}