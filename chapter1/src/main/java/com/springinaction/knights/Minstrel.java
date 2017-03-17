package com.springinaction.knights;

import java.io.*;

/**
 * author: zhaokl
 * <p>
 * created at: 17/03/2017 14:59
 * <p>
 * desc:
 */
public class Minstrel{

	private PrintStream stream;

	public Minstrel(PrintStream stream) {
		this.stream = stream;
	}

	public void singBeforeQuest() {
		stream.println("Fa la la, the knight is so brave!");
	}

	public void singAfterQuest() {
		stream.println("Tee hee hee, the brave knight " +
				"did embark on a quest!");
	}
}
