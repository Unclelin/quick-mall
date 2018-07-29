package cn.cat.admin.controller;

import cn.cat.common.result.Result;
import cn.cat.common.result.ResultCode;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @ApiOperation(value = "登录接口",notes = "登录接口")
    @ApiImplicitParams({@ApiImplicitParam(name = "userName", value = "用户名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "passWord", value = "密码", required = true, dataType = "String"),
            @ApiImplicitParam(name = "validCode", value = "验证码", required = true, dataType = "String")})
    @RequestMapping(value = "login" ,method = RequestMethod.POST)
    public ResponseEntity<Result> login(String userName , String passWord){
        Result result = new Result();
        result.setData(null);
        result.setMessage("获取成功");
        result.setCode(ResultCode.SUCCESS);
        return ResponseEntity.ok(result);
    }

//    @PostMapping("/loginCheck")
//    @ResponseBody
//    public String loginCheck(String userName , String passWord){
//        Subject subject = SecurityUtils.getSubject();
//
//        UsernamePasswordToken token = new UsernamePasswordToken(userName ,passWord);
//        try {
//            subject.login(token);
//        }catch (Exception e){
//            e.printStackTrace();
//            return "登录失败";
//        }
//        return "登录成功";
//    }

//    @RequestMapping("/index")
//    public String index(){
//        return "index";
//    }
}
