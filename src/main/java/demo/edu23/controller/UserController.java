package demo.edu23.controller;

import demo.edu23.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    //按类型进行注入
    private UserService userService;

    @RequestMapping("/user/genCode")
    @ResponseBody
    //自动对接收到的参数进行处理
    public boolean genVerifycode(String nationCode,String phoneNum){

        Boolean flag=userService.sendMsg(nationCode,phoneNum);

        System.out.print(flag);
        return flag;
    }
}
