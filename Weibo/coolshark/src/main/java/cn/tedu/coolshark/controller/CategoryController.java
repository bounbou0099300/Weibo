package cn.tedu.coolshark.controller;

import cn.tedu.coolshark.entity.Category;
import cn.tedu.coolshark.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    CategoryMapper mapper;

    @RequestMapping("select")
    public List<Category> select() {
        return mapper.select();
    }

    @RequestMapping("delete")
    public void delete(int id) {
        mapper.deleteById(id);
    }

}
