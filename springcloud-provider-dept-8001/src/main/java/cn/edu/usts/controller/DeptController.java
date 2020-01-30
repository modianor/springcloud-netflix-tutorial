package cn.edu.usts.controller;

import cn.edu.usts.pojo.Dept;
import cn.edu.usts.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping(path = "/dept/get/{id}")
    public Dept get(@NonNull @PathVariable(name = "id") Integer id) {
        return deptService.findById(id);
    }
}
