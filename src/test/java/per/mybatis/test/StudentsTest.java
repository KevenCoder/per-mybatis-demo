package per.mybatis.test;

import org.junit.Test;
import per.mybatis.bean.Students;
import per.mybatis.dao.StudentsDao;
import per.mybatis.dao.impl.StudentsDaoImpl;
import java.util.List;

public class StudentsTest {

    @Test
    public void addStu(){

        StudentsDao studentsDao = new StudentsDaoImpl();

        studentsDao.addStu(new Students("马云", "18899909090", "杭州", 50.5f));
    }

    @Test
    public void selectAllStu(){

        StudentsDao studentsDao = new StudentsDaoImpl();
        List<Students> students = studentsDao.selectAllStu();

        for (Students stu: students) {

            System.out.println(stu);
        }

    }

    @Test
    public void selectStuById(){

        StudentsDao studentsDao = new StudentsDaoImpl();
        Students students = studentsDao.selectStuById("1");

        System.out.println(students);
    }

    @Test
    public void updateStu(){
        StudentsDao studentsDao = new StudentsDaoImpl();
        studentsDao.updateStu(new Students(1, "马云", "11111111111", "杭州", 88));
    }

    @Test
    public void deleteStu(){
        StudentsDao studentsDao = new StudentsDaoImpl();
        studentsDao.deleteStu(1);
    }
}
