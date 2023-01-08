## 简介

> JPA：同JDBC一样，是SUN定义的一套规范，JDBC是Java访问数据库的规范，JPA是对象映射到数据库表的一种规范！包含几个部分：
> 1. 一套API标准，在javax.persistence包下（封装处理JDBC和SQL）
> 2. 一套面向对象的查询语言JPQL
> 3. 一种支持XML和Java原生注解的ORM映射机制
> 
> Hibernate：JPA规范的一种实现，也是一种ORM框架！
> 
> MyBatis：是一种半自动化的ORM框架！
> 
> MyBatis-Plus：国产一种ORM框架，在MyBatis基础上只做增强，不做改变！
> 
> Spring-Data： 
> 1. 基于Spring的数据访问编程模型，轻松访问（关系数据库，非关系数据库，基于云的数据服务）
> 2. 不仅对传统JDBC，Hibernate，TopLink，JPA，MyBatis做了封装和扩展
> 3. 还对NoSQL数据库做了支持，如Redis，MongoDB，Neo4j
> 4. 还包括Apache Solr，Hadoop 
> 
> Spring-Data-JPA：故，这就是SpringData对JPA的封装，改进，实现，升级，可能也会使用Hibernate的一些实现，或者其他JPA实现方案的部分解决方案