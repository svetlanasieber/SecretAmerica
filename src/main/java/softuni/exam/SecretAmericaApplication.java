package softuni.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericApplicationContext;
import softuni.exam.util.FileUtil;
import softuni.exam.util.FileUtilImpl;

@SpringBootApplication
public class SecretAmericaApplication {

    public static void main(String[] args) {

        SpringApplication.run(SecretAmericaApplication.class, args);
    }

}
