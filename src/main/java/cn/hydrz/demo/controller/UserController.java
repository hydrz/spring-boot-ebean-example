package cn.hydrz.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.hydrz.demo.model.User;
import io.ebean.DB;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> list() {
        List<User> list = DB.find(User.class).where().eq("id", 1).findList();
        return list;
    }
}
