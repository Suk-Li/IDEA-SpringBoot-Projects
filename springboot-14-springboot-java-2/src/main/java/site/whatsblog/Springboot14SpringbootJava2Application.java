package site.whatsblog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import site.whatsblog.service.StudentService;

@SpringBootApplication
public class Springboot14SpringbootJava2Application implements CommandLineRunner {

    @Autowired
    private StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(Springboot14SpringbootJava2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(studentService.sayHello("Dog"));
    }
}
