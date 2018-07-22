package cn.cat.api.controller;

import cn.cat.api.entity.Test;
import cn.cat.common.result.Result;
import cn.cat.common.result.ResultCode;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: cat-lin
 * @Description: swagger2 ApiTestController
 * @Date: Created in 00:05 18/7/22
 * @Modified by:
 */
@RestController
public class ApiTestController {

    @ApiOperation(value = "获取测试信息",notes = "不需要入参获取示例信息")
    @ApiImplicitParam(name = "id", value = "test ID", required = true, dataType = "String", paramType = "path")
    @RequestMapping(value = "apitest/{id}" ,method = RequestMethod.GET)
    public ResponseEntity<Result> test(@PathVariable(value = "id") String id){
        Result result = new Result();
        //result.setData(new Test(1L ,"hello world" , new Date()));
        result.setData(new Test());
        result.setMessage("获取成功");
        result.setCode(ResultCode.SUCCESS);

        return ResponseEntity.ok(result);
    }
}
