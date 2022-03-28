package site.whatsblog.service.impl;

import org.springframework.stereotype.Service;
import site.whatsblog.service.StudentService;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/27 15:20</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String sayHello(String message) {
        return "hello,"+message+"!";
    }
}
