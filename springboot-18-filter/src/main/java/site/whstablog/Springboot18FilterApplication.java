package site.whstablog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "site.whatsblog.filter")
public class Springboot18FilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot18FilterApplication.class, args);
    }

}
