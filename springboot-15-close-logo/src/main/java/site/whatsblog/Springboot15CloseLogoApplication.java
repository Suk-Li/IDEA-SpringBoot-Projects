package site.whatsblog;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot15CloseLogoApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Springboot15CloseLogoApplication.class);
        springApplication.run(args);
    }

}
