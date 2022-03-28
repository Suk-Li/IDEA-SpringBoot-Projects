package site.whatsblog.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import site.whatsblog.mapper.StudentMapper;
import site.whatsblog.pojo.Student;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/28 11:42</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Component
@Service(interfaceClass = StudentService.class,version = "1.0.0",timeout = 1500)
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
