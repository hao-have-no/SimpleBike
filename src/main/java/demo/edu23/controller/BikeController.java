package demo.edu23.controller;

import demo.edu23.pojo.Bike;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BikeController {
    /**
     * 解析请求和相应用户的控制器
     * 加上@Controller可以进行实例化
     */

    @RequestMapping("/addBike")
    @ResponseBody
    public String hello(@RequestBody Bike bike){
        System.out.print(bike);
        return "hello";
    }


}
