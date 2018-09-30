package cn.blz.dao.order;

import java.util.List;
import java.util.Map;

public interface OrderDao {
    List<Map> getOrders(Map args);

    List<Map> getOrdersDynamic(Map args);

    /**
     * 批量处理
     * @param ids
     * @return
     */
    List<Map> getOrdersBatch(List ids);
}
