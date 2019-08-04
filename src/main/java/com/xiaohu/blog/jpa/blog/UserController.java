package com.xiaohu.blog.jpa.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserService userService;


    @RequestMapping("/")
    @ResponseBody
    public  List<User> index(){

        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setAge(10+i);
            user.setPassword("454--"+i);
            user.setUserName("小米"+i);
            userService.save(user);
        }

        List<User> userList = userService.getUserList();
        return userList; //重定向到 /list
    }

}