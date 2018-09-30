package cn.blz.dao.order;

import java.util.List;
import java.util.Map;

public interface OrderDao {
    List<Map> getOrders(Map args);

    List<Map> getOrdersDynamic(Map args);
}
