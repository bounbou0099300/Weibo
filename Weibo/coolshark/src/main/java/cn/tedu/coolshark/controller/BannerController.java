package cn.tedu.coolshark.controller;

import cn.tedu.coolshark.entity.Banner;
import cn.tedu.coolshark.mapper.BannerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("banner")
public class BannerController {
    @Autowired
    BannerMapper mapper;

    @RequestMapping("select")
    public List<Banner> select() {
        return mapper.select();
    }
}
