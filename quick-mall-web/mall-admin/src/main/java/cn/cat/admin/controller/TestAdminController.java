package cn.cat.admin.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cat-lin
 * @Description:
 * @Date: Created in 23:51 18/7/22
 * @Modified by:
 */
@RestController
public class TestAdminController {

    @GetMapping("/test/{name}")
    public String Test(@PathVariable String name){
        if(StringUtils.isEmpty(name)){
            name= "world";
        }
        return "hello " + name;
    }
}
