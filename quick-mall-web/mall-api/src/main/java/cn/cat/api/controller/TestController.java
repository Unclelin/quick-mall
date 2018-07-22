package cn.cat.api.controller;

import cn.cat.common.result.Result;
import cn.cat.common.result.ResultCode;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cat-lin
 * @Description: test http://ip:port/test
 *               spring default testcontroller
 * @Date: Created in 23:06 18/7/19
 * @Modified by:
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("")
    @ResponseBody
    public String home(){
        return "hello World";
    }
}
