package cn.com.task;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


/**
 * @EnableAutoConfiguration   开启自动配置
 * @SpringbootApplication  = @Configuration + @EnableAutoConfiguration + @ComponentScan
 */
@SpringBootApplication
@ComponentScan("cn.com.task.test")
@MapperScan("cn.com.ocj.test.dao")
public class TaskschedulingApplication extends SpringBootServletInitializer  {
        public static void main(String[] args) {
        SpringApplication.run(TaskschedulingApplication.class, args);
    }
}
