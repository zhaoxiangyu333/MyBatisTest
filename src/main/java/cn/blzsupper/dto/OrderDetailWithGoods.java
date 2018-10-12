package cn.blzsupper.dto;

/**
 * 商品详情对商品 1对1关系
 */
public class OrderDetailWithGoods extends OrderDetail{
    private Goods goods;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}
