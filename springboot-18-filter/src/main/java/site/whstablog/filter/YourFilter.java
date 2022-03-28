package site.whstablog.filter; /**
 * <strong>
 * description : ${Description}
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/27 17:37</p>
 * <p>site : https://www.whatsblog.site/</p>
 */

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter(filterName = "YourFilter",value = "/*")
public class YourFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("过滤器..................");
        chain.doFilter(request,response);
    }
}
