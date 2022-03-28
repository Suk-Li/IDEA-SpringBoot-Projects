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
 * <p>date : 2022/3/27 18:10</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("data", "Hello Thymeleaf!");
        return "index";
    }

    @RequestMapping("/url")
    public String url() {
        return "url";
    }
}
