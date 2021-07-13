package com.z.controller;

import com.z.pojo.User;
import com.z.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request){
        User user1 = userService.loginUser(user);
        if(user1!=null){
            request.getSession().setAttribute("user",user1);
            return "redirect:/book/allBooks";
        }
        return "error";
    }


}
