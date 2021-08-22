package pers.chenjiahao.typehandler;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("pers.chenjiahao.typehandler.dao")
public class DemoTypehandlerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoTypehandlerApplication.class, args);
    }

}
