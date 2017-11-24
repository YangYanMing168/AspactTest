package com.app.controler;

import com.app.service.GirlService;
import com.app.util.RestResult;
import com.app.util.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {
    @Autowired
    GirlService girlService;
    @RequestMapping("/index")
    public RestResult<String> index(){
        return ResultUtils.success("index");
    }
    @GetMapping("/girls/getAge/{id}")
    public void  getAge(@PathVariable("id")Integer id) throws Exception {
        girlService.getAge(id);
    }
}
