package cn.hydrz.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import cn.hydrz.demo.model.User;
import io.ebean.DB;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        List<User> list = DB.find(User.class).findList();
        System.out.println(list);
    }
}
