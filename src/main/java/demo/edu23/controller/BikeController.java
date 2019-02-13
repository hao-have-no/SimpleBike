package demo.edu23.controller;

import demo.edu23.pojo.Bike;
import demo.edu23.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
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

    //进入spring容器中，查找BikeService实例，注入到BikeController中
    @Autowired
    private BikeService bikeService;

    @RequestMapping("/addBike")
    @ResponseBody
    public String hello(@RequestBody Bike bike){
        //调用service，将数据保存到mogodb中
        bikeService.save(bike);

        System.out.print(bike);
        return "hello";
    }


}
