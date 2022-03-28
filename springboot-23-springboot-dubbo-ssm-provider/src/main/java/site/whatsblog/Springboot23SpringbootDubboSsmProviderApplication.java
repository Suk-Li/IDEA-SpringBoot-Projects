package site.whatsblog;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class Springboot23SpringbootDubboSsmProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot23SpringbootDubboSsmProviderApplication.class, args);
    }

}
