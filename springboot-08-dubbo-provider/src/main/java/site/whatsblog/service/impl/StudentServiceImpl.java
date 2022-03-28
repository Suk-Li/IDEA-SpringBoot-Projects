package site.whatsblog.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import site.whatsblog.service.StudentService;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/27 13:34</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Component
@Service(interfaceClass = StudentService.class, version = "1.0.0", timeout = 15000)
public class StudentServiceImpl implements StudentService {
    @Override
    public Integer queryAllStudentCount() {
        return 1250;
    }
}
