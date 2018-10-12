package cn.blzsupper.dao;

import cn.blzsupper.dto.UserWithOrder;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<UserWithOrder> getUsersWithOrderDetail();
}
