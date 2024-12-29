package ru.linali.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import ru.linali.springweb.model.User;

@SpringBootApplication
public class SpringWebApplication {

    public static void main(String[] args) {
      var context =   SpringApplication.run(SpringWebApplication.class, args);
        User bean = context.getBean(User.class);
        System.out.println(bean.getName());
    }

}
