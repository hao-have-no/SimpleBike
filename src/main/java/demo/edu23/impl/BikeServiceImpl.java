package demo.edu23.impl;

import demo.edu23.mapper.BikeMapper;
import demo.edu23.pojo.Bike;
import demo.edu23.service.BikeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional //打开事物
public class BikeServiceImpl implements BikeService {


    private BikeMapper bikeMapper;

    @Override
    public void save(Bike bike) {
        //调用DAO将数据保存到Mysql中
        bikeMapper.save(bike);
    }
}
