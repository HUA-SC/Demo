package com.sc.demo.demo_Spring_data_jpa的使用;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sc
 * @create 2018-04-17-16:59
 **/
@RestController
public class SpringDataJpaTest {
    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/spring/jpa")
    public String test() {
//        GsMemberEntity member= memberRepository.findByName("h6");
        GsMemberEntity member= memberRepository.findMember("h6");
        return member.getMemberId().toString();
    }
}
