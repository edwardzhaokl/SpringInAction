package com.springinaction.knights;

import org.springframework.context.support.*;

/**
 * author: zhaokl
 * <p>
 * created at: 17/03/2017 14:22
 * <p>
 * desc:
 */
public class KnightMain{

	public static void main(String[] args) throws Exception{

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");

		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();

		context.close();
	}
}
