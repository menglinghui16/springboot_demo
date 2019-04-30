package com.keduoduo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/4/30.
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("当项目启动时运行MyCommandLineRunner");
    }
}
