package com.ahmiao.springbootlconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication起组合配置的作用
 * =@EnableAutoConfiguration+@ComponentScan
 */
@SpringBootApplication
public class SpringbootlconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootlconfigApplication.class, args);
    }

}
