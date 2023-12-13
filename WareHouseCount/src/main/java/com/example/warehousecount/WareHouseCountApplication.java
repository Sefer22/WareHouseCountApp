package com.example.warehousecount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class WareHouseCountApplication {

    public static void main(String[] args) {

        SpringApplication.run(WareHouseCountApplication.class, args);
    }

}
