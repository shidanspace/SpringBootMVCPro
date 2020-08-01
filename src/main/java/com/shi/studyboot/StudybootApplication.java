package com.shi.studyboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan(value = "com.shi.studyboot.mapper")

public class StudybootApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudybootApplication.class, args);
    }

}
