package site.whatsblog.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import site.whatsblog.pojo.Student;
import site.whatsblog.service.StudentService;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/28 11:37</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Controller
public class StudentController {
    @Reference(interfaceClass = StudentService.class,version = "1.0.0",check = false)
    private StudentService studentService;

    @RequestMapping("/student/detail/{id}")
    public String studentDetail(@PathVariable Integer id, Model model){
        Student student = studentService.queryStudentById(id);
        model.addAttribute("student",student);
        return "studentDetail";
    }
}
