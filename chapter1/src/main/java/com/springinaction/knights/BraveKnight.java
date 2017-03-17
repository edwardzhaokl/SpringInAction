package com.springinaction.knights;

/**
 * author: zhaokl
 * <p>
 * created at: 17/03/2017 13:15
 * <p>
 * desc:
 */
public class BraveKnight implements Knight{

	private Quest quest;

	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	public void embarkOnQuest(){
		quest.embark();
	}

}
