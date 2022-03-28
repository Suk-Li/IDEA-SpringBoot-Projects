package site.whatsblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import site.whatsblog.pojo.User;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/27 17:01</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Controller
@RequestMapping("/user")
public class UserController {
    //登录
    @RequestMapping("/login")
    public @ResponseBody Object login(HttpServletRequest request){
        User dog = new User(1, "Dog", "123");
        request.getSession().setAttribute("user",dog);
        return "login success!";
    }
    //登录后访问
    @RequestMapping("/center")
    public @ResponseBody Object center(){
        return "user has login";
    }
    //不登录访问
    @RequestMapping("/out")
    public @ResponseBody Object out(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        return "user has out";
    }
    //用户未登录访问需要登录才可以访问请求，会跳转到该请求
    @RequestMapping("/error")
    public @ResponseBody Object error(){
        return "error";
    }
}
