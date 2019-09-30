package com.springinaction.knights;

import java.io.PrintStream;

/**
 * @author: zhaokl
 * @creationTime: 2019/9/26 18:06:14
 * @version: 1.0
 * @desc:
 **/
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }

    // 问题: 如何将 SlayDragonQuest 交给 BraveKnight, 以及如何将 PrintStream 交给 SlayDragonQuest
    // 即: 如何装配, 一种方式: XML
    // 配置文件: knight.xml
}
