package per.mybatis.dao;

import per.mybatis.bean.User;

import java.util.List;

public interface UserDao {

    List<User> selectAllUser();

    int insertUser(User user);
}
