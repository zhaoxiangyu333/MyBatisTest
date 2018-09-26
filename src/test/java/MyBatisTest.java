import cn.blz.dao.UserDao;
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
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class MyBatisTest {
    SqlSessionFactory factory = null;
    SqlSession session = null;
    User user = null;
    UserDao userDaoMapper = null;

    @Before
    public void init() throws IOException {
        //把核心配置文件读入流中
        InputStream stream = Resources.getResourceAsStream("config.xml");
        // 创建SqlSession的工厂
        factory = new SqlSessionFactoryBuilder().build(stream);

    }

    @Test
    public void getUserById() {
        // 创建SqlSession会话对象
        session = factory.openSession();
        // 获取mapper
        userDaoMapper = session.getMapper(UserDao.class);
        user = userDaoMapper.getUserById("US00000001");
        System.out.println(user);
    }

    @Test
    public void getUserByName() {
        // 创建SqlSession会话对象
        session = factory.openSession();
        // 获取mapper
        userDaoMapper = session.getMapper(UserDao.class);
        List<User> users = userDaoMapper.getUserByName("李");
        Iterator<User> it = users.iterator();
        if (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Test
    public void insertUser() {
        // 创建SqlSession会话对象
        session = factory.openSession();
        // 获取mapper
        userDaoMapper = session.getMapper(UserDao.class);
        int num = userDaoMapper.insertUser(new User(
                UUID.randomUUID().toString(),
                "wangwu",
                "3",
                "123456",
                "王五",
                "image/wangwu.png"
        ));
        if (num > 0) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    @Test
    public void delete() {
        // 创建SqlSession会话对象
        session = factory.openSession();
        // 获取mapper
        userDaoMapper = session.getMapper(UserDao.class);
        int num = userDaoMapper.deleteUser("US00000002");
        if (num > 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    @After
    public void destory() {
        // 释放资源
        session.close();
    }
}
