package cn.edu.usts.controller;


import cn.edu.usts.pojo.Dept;
import cn.edu.usts.service.DeptClientService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeptController {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(path = "/consumer/dept/get/{id}")
    public Dept get(@NonNull @PathVariable(name = "id") Integer id) {
        return deptClientService.get(id);
    }

}
