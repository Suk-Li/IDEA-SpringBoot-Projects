package site.whatsblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import site.whatsblog.pojo.User;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/27 18:20</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/detail")
    public ModelAndView userDetail(ModelAndView mv){
        User user = new User(1,"Suk","123456");
        mv.addObject("user",user);
        mv.setViewName("user_detail");
        return mv;
    }
}
