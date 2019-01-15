package demo.edu23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//入口文件，启动时扫描带特殊注解的类
@SpringBootApplication

public class XiaoHaoBikeApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(XiaoHaoBikeApplication.class, args);
    }

}

