package cn.edu.usts.service;

import cn.edu.usts.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT-8001")
public interface DeptClientService {
    @GetMapping(path = "/dept/get/{id}") // 这里的地址不要写错 应该是微服务应用名称/../../...
    public Dept get(@NonNull @PathVariable(name = "id") Integer id);
}
