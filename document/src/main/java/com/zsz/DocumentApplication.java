package com.zsz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DocumentApplication {
    /**
     * 注意启动类的位置必须在dao层、service层父级
     *
     * @return
     */
    public static void main(String[] args) {

        SpringApplication.run(DocumentApplication.class, args);
    }
}
