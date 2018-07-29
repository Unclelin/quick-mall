package cn.cat.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Author: cat-lin
 * @Description:
 * @Date: Created in 23:49 18/7/22
 * @Modified by:
 */
@SpringBootApplication
//@EnableWebMvc
public class AdminApplication {

    public static void main(String[] args){
        SpringApplication.run(AdminApplication.class ,args);
    }
}
