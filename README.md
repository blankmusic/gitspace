# 浅析分布式事务
浅析分布式事务：XA、TCC、MQ事务、最大努力通知。
----
## 事务的定义
事务提供一种机制，将一个活动涉及的所有操作纳入一个不可分割的执行单元，就是说事务提供一种要么<br>
全部执行成功，要么就一个也不做的机制。
## 事务的特性
数据库的是事务具有以下四个特性<br>
    1.原子性（actomicity）
   2. 一致性（consistency）
   3. 隔离性（isolation）
    4.持久性（durability）

## InnoDB事务
InnoDB是MySQL的一存储引擎，它的食物是由本地事务资源管理来进行管理的

事务的ACID通过InnoDB的日志和锁来保证，事务的隔离性是通过数据库的锁机制来实现的。<br>
1 原子性和一致性是通过Undo Log来实现

在操作任何数据之前，首先将数据备份到一个地方即（undo log）中，然后进行数据的修改，如果出现错误或者用户执行RollBack，系统可以用undeoLog中的备份将数据恢复到事务开始之前的状态。

2 持久性通过redolog来实现

redolog记录的新数据的备份，在提交十五之前，只要将redolog持久化即可，不需要将数据持久化，当系统奔溃的时候，虽然书就没有持久化，但是reolog已经持久化，系统可以跟库reolog的内容将所有数据恢复到最新的状态。

## 分布式事务

分布式事务就是指事务的参与者、支持事务的服务器，资源服务器以及事务管理器，处于不同的分布式系统的不同节点之上。简单的说，就是一次大的操作由不同的小的操作组成这些小的操作分布在不同的服务器上，而且属于不同的应用。分布式事务需要保证这些事务要么全部成功要么全部失败，本质上，分布式事务就是为了保证不同数据库的一致性。换句话说，分布式事务=n个本地事务。。通过事务管理器实现n个本地事务要么全部成功要么全部失败。

## 分布式事务产生
一个分布式事务的典型例子----用户的下单过程。当整个系统使用微服务器架构之后，一个电商系统往往被拆分为多个子系统：商品系统 订单系统 支付系统 积分系统等。

这样整个下单的流程如下<br>
1用户浏览商品，选择某个商品，点击下单<br>
2订单系统生成一条订单<br>
3订单创建成功，支付系统提供支付功能<br>
4支付完成之后用户的积分值增加<br>

三个步骤放在同一个方法中，再用 ·Spring @Transaction· 注解标识改方法就可以。但是在分布式架构中，这三个步骤要涉及三个系统，设计三个数据库，因此必须要通过分布式事务，实现三个数据库的本地事务同时成功或同时失败。
