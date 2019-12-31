package cn.com.ocj.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;

//@Configuration
//@EnableWebMvc
@Component
public class DataSourceConfiguration {

//    @Bean
//    public JdbcTemplate jdbcTemplate(DataSource dataSource){
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//        return jdbcTemplate;
//    }

//    @Bean
//    public InternalResourceViewResolver getViewResolver(){
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setSuffix(".jsp");
//        viewResolver.setPrefix("../WEB-INF/jsp/");
//        return viewResolver;
//    }
    @Value("${spring.datasource.jndi-name}")
    private static String jndiStringTwo;


    public String getJndiStringTwo() {
        return jndiStringTwo;
    }

    @Override
    public  String toString() {
        final StringBuilder sb = new StringBuilder("JndiProdProperties{");
        sb.append(", jndiStringTwo='").append(jndiStringTwo).append('\'');
        sb.append('}');
        System.out.print("ss-----------------------------------------------"+sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.print(jndiStringTwo);
    }
}
