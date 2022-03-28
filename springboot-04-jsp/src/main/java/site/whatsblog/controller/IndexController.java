package site.whatsblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/25 14:58</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Controller
public class IndexController {
    @RequestMapping("/say")
    public ModelAndView say(ModelAndView mv) {
        mv.setViewName("say");
        mv.addObject("msg", "Hello Dog!");
        return mv;
    }

    @RequestMapping("/say2")
    public String say2(Model model) {
        model.addAttribute("msg", "好好养狗！");
        return "say";
    }
}
