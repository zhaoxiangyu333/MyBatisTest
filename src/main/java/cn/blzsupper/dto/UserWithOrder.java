package cn.blzsupper.dto;

import java.util.List;

/**
 * 用户对订单 1对多关系
 */
public class UserWithOrder extends User {
    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
