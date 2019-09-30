package com.springinaction.knights;

import java.io.PrintStream;

/**
 * @author: zhaokl
 * @creationTime: 2019/9/26 20:55:49
 * @version: 1.0
 * @desc:
 **/
public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        stream.println("Fa la la, the knight is so brave!");
    }

    public void singAfterQuest() {
        stream.println("The hee hee, the brave knight did embark on a quest!");
    }
}
