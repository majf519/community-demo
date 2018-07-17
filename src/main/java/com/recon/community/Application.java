package com.recon.community;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author danielxue
 * @create 2018/7/9
 **/
@SpringBootApplication(scanBasePackages = {"com.recon.community", "com.recon.core"})
@MapperScan("com.recon.community.mapper")
public class Application implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args)  {
        System.out.println("ms-community-government-affairs start!!!");
    }
}
