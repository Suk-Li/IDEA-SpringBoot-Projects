package site.whatsblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import site.whatsblog.service.StudentService;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/25 17:48</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/put/{key}/{value}")
    public @ResponseBody Object put(@PathVariable String key,@PathVariable String value){
        studentService.put(key,value);
        return "值已经成功放入redis";
    }
    @RequestMapping("/get/{key}")
    public @ResponseBody Object get(@PathVariable String key){
        return studentService.get(key);

    }
}
