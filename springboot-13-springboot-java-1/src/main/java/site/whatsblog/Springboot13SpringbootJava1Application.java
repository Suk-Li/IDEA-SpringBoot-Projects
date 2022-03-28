package site.whatsblog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import site.whatsblog.service.StudentService;

@SpringBootApplication
public class Springboot13SpringbootJava1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot13SpringbootJava1Application.class, args);
        StudentService studentService = applicationContext.getBean(StudentService.class);
        System.out.println(studentService.sayHello());
    }

}
