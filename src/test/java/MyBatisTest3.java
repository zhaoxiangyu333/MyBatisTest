import cn.blzsupper.dao.UserDao;
import cn.blzsupper.dto.UserWithOrder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * mybatis高级应用之多对多关系查询
 */
public class MyBatisTest3 {
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
    public void select(){
        session = factory.openSession();
        UserDao mapper = session.getMapper(UserDao.class);
        List<UserWithOrder> list = mapper.getUsersWithOrderDetail();
        System.out.println(list.get(0).getOrders().get(0).getOrderCode());
    }

    @After
    public void destory() {
        // 释放资源
        session.close();
    }
}
