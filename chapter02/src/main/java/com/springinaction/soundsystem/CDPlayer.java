package com.springinaction.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: zhaokl
 * @creationTime: 2019/9/29 14:21:07
 * @version: 1.0
 * @desc:
 **/
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    // @Autowired(required = false) //required 属性, 要用对
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }

    @Autowired
    public void setCompactDisc(CompactDisc cd) {
        this.cd = cd;
    }
}

// @Autowired 注解可以用在类的任何方法
// @Autowired 是 spring 特有的注解, 可以使用 @Inject 代替, 细微差异
// @Inject 来源于 Java依赖注入规范
