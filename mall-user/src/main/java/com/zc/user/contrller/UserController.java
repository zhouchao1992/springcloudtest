package com.zc.user.contrller;

import com.zc.user.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/")
@RefreshScope
public class UserController {

    @GetMapping("info")
    public Object userInfo(String userId){
        return "userInfo->user_success!";
    }

    @PostMapping("login")
    public  Object login(@RequestBody User user){
        if ("admin".equals(user.getUsername()) && "123456".equals(user.getPassword())){
            return user.getUsername()+"->login_usertwo_success!";
        }
        return "login->error";
    }
}
