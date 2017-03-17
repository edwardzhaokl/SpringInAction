package com.springinaction.knights;

import java.io.*;

/**
 * author: zhaokl
 * <p>
 * created at: 17/03/2017 13:30
 * <p>
 * desc:
 */
public class SlayDragonQuest implements Quest{

	private PrintStream stream;

	public SlayDragonQuest(PrintStream printStream) {
		this.stream = printStream;
	}

	public void embark(){
		stream.println("Embarking on quest to slay the dragon!");
	}
}
