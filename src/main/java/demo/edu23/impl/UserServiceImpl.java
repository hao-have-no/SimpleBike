package demo.edu23.impl;

import demo.edu23.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Override
    public Boolean sendMsg(String nationCode, String phoneNum) {
        boolean flag=true;

        //int appid=Integer.parseInt(stringRedisTemplate.opsForValue().get("appid"));
        //String appkey=stringRedisTemplate.opsForValue().get("appkey");

        String code=(int)(Math.random()*9+1)*1000+"";
       // SmsSingleSender ssender = new SmsSingleSender(appid, appkey);
        try {
            //发送消息
            //ssender.send(0, nationCode,phoneNum,"您登陆的验证码为"+code, "", "");
            //将发送的手机号，验证码保存到redis中
            stringRedisTemplate.opsForValue().set(phoneNum,code,300,TimeUnit.SECONDS);
        }catch (Exception e){
            flag=false;
            e.printStackTrace();
        }


        return flag;
    }
}
