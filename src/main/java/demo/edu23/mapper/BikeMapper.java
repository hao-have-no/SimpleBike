package demo.edu23.mapper;


import demo.edu23.pojo.Bike;
import org.apache.ibatis.annotations.Mapper;

/**
 * MyBatis的注解是在接口上添加的，Spring会跟接口和XML创建一个实现类，然后用这个实现类对数据库进行操作
 */
@Mapper
public interface BikeMapper {
    void save(Bike bike);
}
