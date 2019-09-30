package com.springinaction.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zhaokl
 * @creationTime: 2019/9/29 14:51:21
 * @version: 1.0
 * @desc:
 **/
@Configuration
// 移除了 @ComponentScan 注解, 则需要显示配置 Bean
public class CDPlayerConfig2 {

    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    // @Bean 注解告诉 Spring 这个方法会返回一个对象, 该对象要注册为 Spring 应用上下文中的 bean
    // @Bean 默认 bean 的id为方法名 sgtPeppers
    // @Bean(name = "lonelyHeartsClubBand") 
    // 可以指定 bean 的名字

    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(sgtPeppers());
    }

    // 看起来, CompactDisc 是通过调用 sgtPeppers()方法得到的, 
    // 但其实, 因为 sgtPeppers()方法有@Bean 的注解, Spring会拦截所有对它的调用, 
    // 并确保直接返回该方法说创建的 bean, 而不是每次都时间调用
}
