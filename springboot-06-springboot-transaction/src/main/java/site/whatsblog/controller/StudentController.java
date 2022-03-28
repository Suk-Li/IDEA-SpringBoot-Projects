package site.whatsblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
 * <p>date : 2022/3/25 16:13</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/student/{id}")
    public @ResponseBody Student student(@PathVariable Integer id){
        return studentService.findStudentById(id);
    }

    @RequestMapping("/update/{id}/{name}/{age}")
    public @ResponseBody Object update(@PathVariable Integer id,@PathVariable String name,@PathVariable Integer age){
        Student student = new Student(id, name,age);
        return studentService.updateStudentById(student);
    }
}
