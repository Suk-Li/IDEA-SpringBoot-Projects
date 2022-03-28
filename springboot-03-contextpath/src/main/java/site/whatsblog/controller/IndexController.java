package site.whatsblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/24 11:26</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Controller
@RequestMapping
public class IndexController {
    @ResponseBody
    @RequestMapping("/say")
    public String say(){
        return "Hello！";
    }
    public @RequestMapping("/getMap") @ResponseBody Map<String, Object> getMap(HttpServletResponse response){
        Map<String, Object> map = new HashMap<>();
        map.put("msg","SpringBoot Project");
        map.put("code",200);
        return map;
    }
}
