package me.zuhr.demo;

import me.zuhr.demo.std.BaseApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author zurun
 * @date 2018/3/19 12:24:55
 */
@SpringCloudApplication
public class WxAppApplication extends BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(WxAppApplication.class, args);
    }
}
