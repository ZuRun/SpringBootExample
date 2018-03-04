# Spring Cloud Config Server,配置管理中心

## bootstrap.yml模板

```yaml
# 更改server.port,application.name,cloud.config.name 即可

server:
  port: 19011
spring:
  application:
    # spring.application.name必须要设置，服务消费者将通过该名称调用所提供的服务。
    name: eureka-client-consumer
  cloud:
    # 使用配置中心
    config:
      # 配置了name,则配置文件名为:name-profile.yml/properties
      name: ecc,redis
      # 开发环境
      profile: ${spring.profiles.active:dev}
      # 分支
      label: rocketmq
      discovery:
        enabled: true
        serviceId: std-config-server
      failFast: true
      retry:
        initialInterval: 10000
        multiplier: 2
        maxInterval: 60000
        maxAttempts: 10


# 所有微服务通用配置
# eureka.client.service-url也必须设置，表示我们要向那些Eureka服务器进行服务注册，这里可以声明多个Eureka服务器
eureka:
  client:
    service-url:
      defaultZone: http://localhost:18001/eureka
```