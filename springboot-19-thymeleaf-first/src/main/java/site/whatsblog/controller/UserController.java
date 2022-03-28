package site.whatsblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/27 18:02</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Controller
public class UserController {
    @RequestMapping("/message")
    public String message(Model model){
        model.addAttribute("msg","Hello Thymeleaf");
        return "message";
    }
}
