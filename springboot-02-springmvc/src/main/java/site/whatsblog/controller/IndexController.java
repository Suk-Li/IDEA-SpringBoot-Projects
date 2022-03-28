package site.whatsblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/24 11:17</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }
}
