package com.springinaction.knights;

/**
 * author: zhaokl
 * <p>
 * created at: 17/03/2017 13:09
 * <p>
 * desc:
 */
public class DamselRescuingKnight implements Knight{

	private RescueDamselQuest quest;

	public DamselRescuingKnight() {
		this.quest = new RescueDamselQuest();
	}

	public void embarkOnQuest() {
		quest.embark();
	}
}
