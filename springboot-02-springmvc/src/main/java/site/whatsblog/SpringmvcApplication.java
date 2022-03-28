package site.whatsblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//SpringBoot项目启动入口类
@SpringBootApplication //开启springboot配置
public class SpringmvcApplication {

    // SpringBoot项目代码必须放到Application类所在的同级或下级目录
    public static void main(String[] args) {
        SpringApplication.run(SpringmvcApplication.class, args);
    }

}
