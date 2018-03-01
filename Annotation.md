## 销毁
- 方法前加@PreDestroy

- @Bean(destroyMethod = "destroy")




## Condition - 满足指定条件才生效
```
@Conditional(TestCondition.class)

这句代码可以标注在类上面，表示该类下面的所有@Bean都会启用配置，也可以标注在方法上面，只是对该方法启用配置。

 

spring框架还提供了很多@Condition给我们用，当然总结用语哪种好理解，看给位读者喽

@ConditionalOnBean（仅仅在当前上下文中存在某个对象时，才会实例化一个Bean）
@ConditionalOnClass（某个class位于类路径上，才会实例化一个Bean）
@ConditionalOnExpression（当表达式为true的时候，才会实例化一个Bean）
@ConditionalOnMissingBean（仅仅在当前上下文中不存在某个对象时，才会实例化一个Bean）
@ConditionalOnMissingClass（某个class类路径上不存在的时候，才会实例化一个Bean）
@ConditionalOnNotWebApplication（不是web应用）

```
另一种总结

[@ConditionalOnClass](common/rocketmq/src/main/java/me/zuhr/demo/rocketmq/config/RocketmqConfig.java)：该注解的参数对应的类必须存在，否则不解析该注解修饰的配置类；
@ConditionalOnMissingBean：该注解表示，如果存在它修饰的类的bean，则不需要再创建这个bean；可以给该注解传入参数例如@ConditionOnMissingBean(name = "example")，这个表示如果name为“example”的bean存在，这该注解修饰的代码块不执行。


