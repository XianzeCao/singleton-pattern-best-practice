package com.zaccao.pattern.singleton.test;

import com.zaccao.pattern.singleton.register.ContainerSingleton;


public class ContainerSingletonTest {
    public static void main(String[] args) {
        Object instance1 = ContainerSingleton.getInstance("com.gupaoedu.vip.pattern.singleton.test.Pojo");
        Object instance2 = ContainerSingleton.getInstance("com.gupaoedu.vip.pattern.singleton.test.Pojo");
        System.out.println(instance1 == instance2);
    }
}
