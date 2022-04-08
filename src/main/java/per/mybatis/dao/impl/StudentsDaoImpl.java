package per.mybatis.dao.impl;


import org.apache.ibatis.session.SqlSession;
import per.mybatis.dao.StudentsDao;
import per.mybatis.bean.Students;
import per.mybatis.utils.MyBatisUtil;

import java.util.List;

public class StudentsDaoImpl implements StudentsDao {


    /**
     * 添加学生
     *
     * @param stu 学生对象
     */
    @Override
    public void addStu(Students stu) {

        SqlSession sqlSession = null;

        try{
            sqlSession = MyBatisUtil.getSqlSession();
            //事务开始（默认）

            //读取StudentMapper.xml配置文件中的sql语句
            int i = sqlSession.insert("studentsNamespace.addStu", stu);
            System.out.println("本次操作影响了"+i+"行数据");

            //事务提交
            sqlSession.commit();

        }catch(Exception e){
            e.printStackTrace();
            //事务回滚
            sqlSession.rollback();
            throw e;
        }finally{
            MyBatisUtil.closeSqlSession();
        }
    }

    /**
     * 查询所有学生
     *
     * @return 学生集合
     */
    @Override
    public List<Students> selectAllStu() {

        SqlSession sqlSession = null;

        List<Students> stuList = null;
        try{
            sqlSession = MyBatisUtil.getSqlSession();
            //事务开始（默认）

            //读取StudentMapper.xml配置文件中的sql语句
            stuList = sqlSession.selectList("studentsNamespace.selectAllStu");

            //事务提交
            sqlSession.commit();
        }catch(Exception e){
            e.printStackTrace();
            //事务回滚
            sqlSession.rollback();
            throw e;
        }finally{
            MyBatisUtil.closeSqlSession();
        }

        return stuList;
    }

    /**
     * 按id查询学生
     *
     * @param id 学生id
     *
     * @return  学生对象
     */
    @Override
    public Students selectStuById(String id) {
        SqlSession sqlSession = null;
        Students stu = null;
        try{
            sqlSession = MyBatisUtil.getSqlSession();
            //事务开始（默认）

            //读取StudentMapper.xml配置文件中的sql语句
            stu = sqlSession.selectOne("studentsNamespace.selectStuById", id);

            //事务提交
            sqlSession.commit();
        }catch(Exception e){
            e.printStackTrace();
            //事务回滚
            sqlSession.rollback();
            throw e;
        }finally{
            MyBatisUtil.closeSqlSession();
        }

        return stu;
    }

    /**
     * 更新学生记录
     *
     * @param students 学生对象
     */
    @Override
    public void updateStu(Students students) {
        SqlSession sqlSession = null;
        try{
            sqlSession = MyBatisUtil.getSqlSession();
            //事务开始（默认）

            //读取StudentMapper.xml配置文件中的sql语句
            int num = sqlSession.update("studentsNamespace.updateStu", students);
            System.out.println("更新记录 ： " + num + "条");

            //事务提交
            sqlSession.commit();
        }catch(Exception e){
            e.printStackTrace();
            //事务回滚
            sqlSession.rollback();
            throw e;
        }finally{
            MyBatisUtil.closeSqlSession();
        }
    }

    /**
     * 根据id删除学生
     *
     * @param id 学生id
     */
    @Override
    public void deleteStu(int id) {

        SqlSession sqlSession = null;
        try{
            sqlSession = MyBatisUtil.getSqlSession();
            //事务开始（默认）

            //读取StudentMapper.xml配置文件中的sql语句
            int num = sqlSession.delete("studentsNamespace.deleteStu", id);
            System.out.println("删除记录 ： " + num + "条");
            //事务提交
            sqlSession.commit();
        }catch(Exception e){
            e.printStackTrace();
            //事务回滚
            sqlSession.rollback();
            throw e;
        }finally{
            MyBatisUtil.closeSqlSession();
        }

    }
}
