package site.whatsblog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import site.whatsblog.mapper.StudentMapper;
import site.whatsblog.pojo.Student;
import site.whatsblog.service.StudentService;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/25 16:15</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student findStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Transactional
    @Override
    public Integer updateStudentById(Student student) {
        int i1 = studentMapper.updateByPrimaryKey(student);
        int i = 10/0;
        return i1;
    }
}
