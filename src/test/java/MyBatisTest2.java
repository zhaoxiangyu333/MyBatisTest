import cn.blz.dao.order.OrderDao;
import cn.blz.dto.Order;
import cn.blz.dto.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class MyBatisTest2 {
    SqlSessionFactory factory = null;
    SqlSession session = null;

    @Before
    public void init() throws IOException {
        //把核心配置文件读入流中
        InputStream stream = Resources.getResourceAsStream("config.xml");
        // 创建SqlSession的工厂
        factory = new SqlSessionFactoryBuilder().build(stream);
    }

    @Test
    public void getOrders() {
        session = factory.openSession();
        OrderDao mapper = session.getMapper(OrderDao.class);
        Map args = new HashMap();
        User user = new User();
        user.setCname("李工");
        args.put("user", user);
        List<Order> list = mapper.getOrders(args);
        System.out.println(list);
    }

    @After
    public void destory() {
        // 释放资源
        session.close();
    }
}
