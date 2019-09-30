package com.springinaction.soundsystem;

//import javax.inject.Named;

import org.springframework.stereotype.Component;

/**
 * @author: zhaokl
 * @creationTime: 2019/9/29 10:31:17
 * @version: 1.0
 * @desc:
 **/
// 为 bean 设置 ID
// 方式 1
@Component("lonelyHeartClub")
// 方式 2
//@Named("lonelyHeartClub")
// 默认不启用, 如何启用? 1. ComponentScan 2. xml
public class SgtPeppers implements CompactDisc {

    private String title  = "Sgt. Pepper's Lonely Hearts Club Band";

    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
