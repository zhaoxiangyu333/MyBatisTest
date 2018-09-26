package cn.blz.dao;

import cn.blz.dto.User;

import java.util.List;

public interface UserDao {
    // 根据id获得用户
    User getUserById(String user_id);

    // 根据用户名获得用户
    List<User> getUserByName(String user_name);

    // 添加用户
    int insertUser(User user);

    // 根据id删除用户
    int deleteUser(String user_id);

}
