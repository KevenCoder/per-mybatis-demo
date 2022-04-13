package per.mybatis.test;


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import per.mybatis.bean.User;
import per.mybatis.dao.UserDao;
import per.mybatis.utils.MyBatisUtil;

import java.util.List;

public class UserTest {



    @Test
    public void selectAllUser(){

        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);

        List<User> users = mapper.selectAllUser();

        for (User user : users){
            System.out.println(user);
        }

        sqlSession.close();

    }

    @Test
    public void insertUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int i = mapper.insertUser(new User(2, "小乔", "qiao123"));

        sqlSession.commit();

        System.out.println(i+"条发生提交");

        sqlSession.close();

    }
}
