package per.mybatis.dao;

import per.mybatis.bean.Students;

import java.util.List;

public interface StudentsDao {

    public void addStu(Students stu); //添加学生

    public List<Students> selectAllStu(); //查询所有学生

    public Students selectStuById(String id); //按id查询学生

    public void updateStu(Students students); //更新学生记录

    public void deleteStu(int id); //按id删除学生

}
