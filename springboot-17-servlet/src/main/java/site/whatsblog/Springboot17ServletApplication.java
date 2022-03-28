package site.whatsblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan("site.whstablog.filter")
public class Springboot17ServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot17ServletApplication.class, args);
    }

}
