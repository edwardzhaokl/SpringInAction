package com.springinaction.knights;

/**
 * @author: zhaokl
 * @creationTime: 2019/9/26 21:02:43
 * @version: 1.0
 * @desc: Knight 与 Minstrel 的第一次组合尝试
 **/
public class BraveKnightV1 implements Knight {

    private Quest    quest;
    private Minstrel minstrel;

    public BraveKnightV1(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel = minstrel;
    }

    @Override
    public void embarkOnQuest() {
        minstrel.singAfterQuest();
        quest.embark();
        minstrel.singAfterQuest();
    }

    // singBeforeQuest() 与 singAfterQuest() 本来是 Minstrel的职责, 
    // 放在 Knight 中, 自然不太合适, 怎么办? 
    // 切面!

}
