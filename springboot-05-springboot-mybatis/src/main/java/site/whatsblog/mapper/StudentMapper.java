package site.whatsblog.mapper;

import org.apache.ibatis.annotations.Mapper;
import site.whatsblog.pojo.Student;

@Mapper // 扫描dao接口到spring容器
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}