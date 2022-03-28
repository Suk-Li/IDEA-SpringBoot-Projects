package site.whstablog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/27 17:28</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@RestController
public class MyController {
    @RequestMapping("/status")
    public String success(){
        return "Success!";
    }
}
