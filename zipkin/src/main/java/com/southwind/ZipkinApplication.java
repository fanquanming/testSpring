package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;
//声明启动zipkinserver
@SpringBootApplication
@EnableZipkinServer
public class ZipkinApplication {
    public static void main(String[] args){
        SpringApplication.run(ZipkinApplication.class,args);
    }
}
