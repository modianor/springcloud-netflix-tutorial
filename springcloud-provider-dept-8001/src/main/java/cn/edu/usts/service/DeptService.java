package cn.edu.usts.service;

import cn.edu.usts.dao.DeptMapper;
import cn.edu.usts.pojo.Dept;
import cn.edu.usts.pojo.DeptExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {
    @Autowired
    private DeptMapper deptMapper;

    public Dept findById(@NonNull Integer id) {
        return deptMapper.selectByPrimaryKey(id);
    }
}
