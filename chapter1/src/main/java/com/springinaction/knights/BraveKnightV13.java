package com.springinaction.knights;

/**
 * author: zhaokl
 * <p>
 * created at: 17/03/2017 15:05
 * <p>
 * desc:
 */
public class BraveKnightV13 implements Knight{

	private Quest quest;
	private Minstrel minstrel;

	public BraveKnightV13(Quest quest, Minstrel minstrel) {
		this.quest = quest;
		this.minstrel = minstrel;
	}

	public void embarkOnQuest() {
		minstrel.singBeforeQuest();
		quest.embark();
		minstrel.singAfterQuest();
	}
}
