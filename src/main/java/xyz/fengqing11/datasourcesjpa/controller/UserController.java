package xyz.fengqing11.datasourcesjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.fengqing11.datasourcesjpa.dao1.UserDao1;
import xyz.fengqing11.datasourcesjpa.dao2.UserDao2;
import xyz.fengqing11.datasourcesjpa.pojo.User;

@RestController
public class UserController {
    @Autowired
    UserDao1 userDao1;
    @Autowired
    UserDao2 userDao2;
    @GetMapping("/test")
    public void test(){
        User u1 = new User();
        u1.setAge(55);
        u1.setGender("男");
        u1.setName("氨基酸诋毁");
        userDao1.save(u1);
        User u2 = new User();
        u2.setAge(44);
        u2.setGender("女");
        u2.setName("爱上丢眼");
        userDao2.save(u2);
    }
}
