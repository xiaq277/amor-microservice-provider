package com.it.amor.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务提供者-Demo启动类
 * Created by sunqi1 on 2018年2月13日
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
