### 总结

演进顺序: 
1. DamselRescuingKnight 紧耦合
2. BraveKnightTest 通过接口, 松耦合, 构造器注入, 及测试
3. SlayDragonKnight 通过配置文件注入 knight.xml, 注意 ref/value
4. SlayDragonKnight 通过 Java配置注入 KnightConfig
5. 装载 XML配置文件, 启动应用(注意 spring-EL表达式)
6. 