package com.person.gulimall.order;


import com.person.gulimall.order.entity.OrderEntity;
import com.person.gulimall.order.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallOrderApplicationTests {

    @Autowired
    OrderService orderService;

    @Test
    public void contextLoads() {
        List<OrderEntity> list = orderService.list();

        for (OrderEntity order : list
        ) {
            System.out.println("***************");
            System.out.println(order.toString());
            System.out.println("***************");
        }

    }

}
