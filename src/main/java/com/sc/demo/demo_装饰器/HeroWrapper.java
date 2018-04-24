package com.sc.demo.demo_装饰器;

/**
 * 这是一个包装类，用来包装Hero，输出自己的武器名
 *
 * @author sc
 * @create 2018-04-10-17:26
 **/
public class HeroWrapper extends Hero{
    @Override
    public void saber() {
        System.out.println("saber use sword");
    }

    @Override
    public void assassin() {
        System.out.println("assassin use knife");
    }

    @Override
    public void archer() {
        System.out.println("archer use bow and arrow");
    }
}
