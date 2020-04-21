package com.github.wohatel.order;


import com.github.wohatel.common.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {OrderApplication.class})
public class KafkaApplicationTests {

    @Reference
    UserService userService;

    @Test
    public void select() {
        String userName = userService.getUserName();
        System.out.println(userName);
    }
}
