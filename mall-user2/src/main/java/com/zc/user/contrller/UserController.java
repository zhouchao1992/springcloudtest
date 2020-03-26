package com.zc.user.contrller;

import com.zc.user.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/")
public class UserController {

    @GetMapping("info")
    public Object userInfo(String userId){
        return "userInfo->8012_success!";
    }

    @PostMapping("login")
    public  Object login(@RequestBody User user){
        if ("admin".equals(user.getUsername()) && "123456".equals(user.getPassword())){
            return user.getUsername()+"->login_8012_success!";
        }
        return "login->error";
    }
}
