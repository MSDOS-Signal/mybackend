package com.xinhao.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class XinhaoChatApplication {

    @PostConstruct
    public void init() {
        // 设置默认时区为上海，解决时间不一致问题
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
    }

    public static void main(String[] args) {
        SpringApplication.run(XinhaoChatApplication.class, args);
    }

}
