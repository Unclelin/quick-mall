package cn.cat.admin.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: cat-lin
 * @Description:
 * @Date: Created in 00:33 18/7/25
 * @Modified by:
 */
@Controller
@RequestMapping("")
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/loginCheck")
    @ResponseBody
    public String loginCheck(String userName , String passWord){
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken(userName ,passWord);
        try {
            subject.login(token);
        }catch (Exception e){
            e.printStackTrace();
            return "登录失败";
        }
        return "登录成功";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
