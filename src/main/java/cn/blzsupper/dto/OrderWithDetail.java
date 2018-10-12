package cn.blzsupper.dto;

import java.util.List;

/**
 * order对orderdetail 1对多
 */
public class OrderWithDetail extends Order {
    private List<OrderDetail> orderDetails;

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
