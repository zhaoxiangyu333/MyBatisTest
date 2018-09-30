package cn.blz.dao.order;

import cn.blz.dto.Order;

import java.util.List;
import java.util.Map;

public interface OrderDao {
    /**
     * user 用户
     *
     * @param args
     * @return
     */
    List<Map> getOrders(Map args);
}
