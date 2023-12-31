package cn.tedu.coolshark.mapper;

import cn.tedu.coolshark.entity.Banner;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BannerMapper {
    @Select("select * from banner")
    List<Banner> select();
}
