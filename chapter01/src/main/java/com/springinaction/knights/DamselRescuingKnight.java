package com.springinaction.knights;

/**
 * @author: zhaokl
 * @creationTime: 2019/9/26 16:28:11
 * @version: 1.0
 * @desc:
 **/

public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        quest = new RescueDamselQuest();
        // 以上方式: 典型的紧耦合
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }

    // 测试困难:
    // 在测试中, 必须保证当骑士的 embarkOnQuest()被调用时, 探险的 embark()方法也要被调用
    // DamselRescuingKnight 无法进行测试
    // TODO: 为什么? 怎么理解这句话? 不熟悉编写测试
}
