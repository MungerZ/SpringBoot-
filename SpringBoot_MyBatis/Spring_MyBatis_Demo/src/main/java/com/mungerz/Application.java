package com.mungerz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// SpringBootApplication注解：负责启动SpringBoot项目。这个注解实现了扫描包的功能，扫描范围是该文件所在的当前目录和同级目录。
// 我们需要格外注意这个注解所在文件的位置，因为它和扫包有关系。什么是扫包？就是发现Service,Controller,Component然后自动注入到Spring容器中。
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
