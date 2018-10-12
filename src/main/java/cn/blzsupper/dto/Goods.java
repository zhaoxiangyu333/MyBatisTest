package cn.blzsupper.dto;

import java.util.Date;

public class Goods {
    private String goodsId;
    private String goodsTitle;
    private String goodsDescription;
    private Date goodsCreateDate;
    private double goodsPrice;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public String getGoodsDescription() {
        return goodsDescription;
    }

    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    public Date getGoodsCreateDate() {
        return goodsCreateDate;
    }

    public void setGoodsCreateDate(Date goodsCreateDate) {
        this.goodsCreateDate = goodsCreateDate;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
}
