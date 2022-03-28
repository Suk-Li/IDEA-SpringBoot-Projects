package site.whatsblog.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import site.whatsblog.service.StudentService;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/27 13:28</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Controller
public class StudentController {
    @Reference(interfaceClass = StudentService.class,version = "1.0.0",check = false)
    private StudentService studentService;

    @RequestMapping("/student/count")
    public @ResponseBody
    Object studentCount() {
        Integer count = studentService.queryAllStudentCount();
        return "学生总人数为：" + count;
    }
}
