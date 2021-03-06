package site.whatsblog.mapper;

import org.apache.ibatis.annotations.Mapper;
import site.whatsblog.pojo.Student;
@Mapper
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    Integer selectAllStudentCount();
}