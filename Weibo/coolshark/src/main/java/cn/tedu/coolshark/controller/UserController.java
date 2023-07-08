package cn.tedu.coolshark.controller;

import cn.tedu.coolshark.entity.User;
import cn.tedu.coolshark.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class UserController {
    @Autowired
    UserMapper mapper;

    @RequestMapping("login")
    public int login(@RequestBody User user, HttpSession session) {
        User u = mapper.selectByUsername(user.getUsername());
        if (u != null) {
            if (u.getPassword().equals(user.getPassword())) {
                //把登录成功的用户对象保存到会话对象中
                session.setAttribute("user",u);
                return 1;
            }
            return 3; //密码错误
        }
        return 2; // 用户名不存在
    }
}
