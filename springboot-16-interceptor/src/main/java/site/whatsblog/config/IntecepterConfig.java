package site.whatsblog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import site.whatsblog.interceptor.UserInterceptor;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/27 16:58</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Configuration
public class IntecepterConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截，其中是用户登录后才能访问的
        String[] addPathPatterns={
                "/user/**"
        };
        //不拦截,排除的路径说明不需要登录也可以访问
        String[] excludePathPatterns={
                "/user/out","/user/error","/user/login"
        };
        UserInterceptor userInterceptor = new UserInterceptor();
        registry.addInterceptor(userInterceptor).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);

    }
}
