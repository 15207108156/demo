package com.example.model;

import java.math.BigDecimal;

public class Goods {
    //    商品ID
    private Integer id;
    //    商品名称
    private String goodsname;
    //    商品价格
    private BigDecimal goodsprice;
    //    商品数量
    private Integer goodsnum;
    //    商品剩余数量
    private Integer goodsremaining;
    //    创建时间
    private String createdate;
    //    商品类型
    private Integer goodstypeid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public BigDecimal getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(BigDecimal goodsprice) {
        this.goodsprice = goodsprice;
    }

    public Integer getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    public Integer getGoodsremaining() {
        return goodsremaining;
    }

    public void setGoodsremaining(Integer goodsremaining) {
        this.goodsremaining = goodsremaining;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public Integer getGoodstypeid() {
        return goodstypeid;
    }

    public void setGoodstypeid(Integer goodstypeid) {
        this.goodstypeid = goodstypeid;
    }
}