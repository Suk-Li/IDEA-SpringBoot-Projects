package site.whatsblog.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import site.whatsblog.pojo.Student;
import site.whatsblog.service.StudentService;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/27 14:34</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Controller
public class StudentController {

    @Reference(interfaceClass = StudentService.class,version = "1.0.0",check = false)
    private StudentService studentService;

    @RequestMapping("/student/detail/{id}")
    public String studentDetail(Model model, @PathVariable Integer id){
        Student student = studentService.queryStudentById(id);
        model.addAttribute("student",student);
        return "studentDetail";
    }

    @RequestMapping("/student/all/count")
    public @ResponseBody Object allStudentCount(){
        Integer allStudentCount=studentService.queryAllStudentCount();
        return allStudentCount;
    }
}
