package com.springinaction.knights;

/**
 * @author: zhaokl
 * @creationTime: 2019/9/26 16:39:07
 * @version: 1.0
 * @desc:
 **/
public class BraveKnight implements Knight {

    private Quest quest;

    /**
     * 通过传参的方式, 注入 Quest <br>
     * 依赖注入的方式之一: 构造器注入 constructor injection <br>
     * 重点在于: BraveKnight没有与任何 Quest的实现发生耦合, 即, 可以用任何实现了 Quest 接口的类替换 <br>
     * 通过接口来表明依赖关系, 能在依赖对象本身不知情的情况下, 用不同的具体实现进行替换
     */
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
