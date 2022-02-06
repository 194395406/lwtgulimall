package com.person.gulimall.member;


import com.person.gulimall.member.entity.MemberEntity;
import com.person.gulimall.member.service.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallMemberApplicationTests {

    @Autowired
    MemberService memberService;

    @Test
    public void contextLoads() {

        List<MemberEntity> list = memberService.list();
        for (MemberEntity member : list
        ) {

            System.out.println("=============");
            System.out.println(member.toString());
            System.out.println("=============");

        }
    }

}
