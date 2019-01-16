package com.hospital.hospital;

import com.hospital.hospital.domain.AccessoryCost;
import com.hospital.hospital.mapper.AccessoryCostMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

/**
 * @program: hospital
 * @description:
 * @author: wangshu
 * @create: 2019-01-16
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAccessoryComapper {

    @Autowired
    private AccessoryCostMapper accessoryCostMapper;

    @Test
    public void testInsert(){
        AccessoryCost a = new AccessoryCost();


      //  accessoryCostMapper.insert(a);
    }
}
