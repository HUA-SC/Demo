package com.sc.demo.demo_装饰器;


/**
 * 用于测试wrapper类的作用
 * 参考链接：https://www.jianshu.com/p/0ea8c2fe8e10
 * @author sc
 * @create 2018-04-10-17:34
 **/
public class WrapperTest {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.saber();
        hero.assassin();
        hero.archer();

        Hero heroWrapper = new HeroWrapper();
        heroWrapper.saber();
        heroWrapper.assassin();
        heroWrapper.archer();

    }
}
