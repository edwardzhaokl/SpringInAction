package com.springinaction.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zhaokl
 * @creationTime: 2019/9/29 10:35:23
 * @version: 1.0
 * @desc:
 **/
@Configuration
// 默认扫描与配置类相同的包
@ComponentScan
// 可以指定要扫描的基础包, 可以是多个, 类型不安全
//@ComponentScan(basePackages = "com.springinaction.soundsystem", "com.springinaction.video")
@ComponentScan(basePackages = "com.springinaction.soundsystem")

// 可以指定为保重所包含的类或接口, 可以多个, 类型安全
@ComponentScan(basePackageClasses = { CDPlayerConfig.class, CompactDisc.class })
public class CDPlayerConfig {

}
