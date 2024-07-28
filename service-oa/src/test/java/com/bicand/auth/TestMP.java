package com.bicand.auth;

import com.bicand.auth.mapper.SysRoleMapper;
import com.bicand.model.system.SysRole;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @program: bicand-oa-parent
 * @description:
 * @author: bicand
 * @create: 2024-07-28 11:24
 **/

@SpringBootTest
public class TestMP {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Test
    public void getAll(){
        List<SysRole> sysRoleList = sysRoleMapper.selectList(null);
        System.out.println(sysRoleList);
    }
}
